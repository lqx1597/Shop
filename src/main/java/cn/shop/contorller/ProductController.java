package cn.shop.contorller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.shop.po.CustomerDeve;
import cn.shop.po.Customeraddress;
import cn.shop.po.Product;
import cn.shop.service.CustomerAddressService;
import cn.shop.service.ProductService;

@Controller
public class ProductController {

	// 商品信息
	@Autowired
	private ProductService productService;

	// 获取地址信息
	@Autowired
	private CustomerAddressService customerAddressService;

	// 获取所有商品信息
	// 前往首页
	@RequestMapping("productQuery")
	private void productQuery(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// 获取全部商品
		List<Product> productAll = productService.getProductAll();
		req.getSession().setAttribute("productAll", productAll);		
		req.getRequestDispatcher("product.jsp").forward(req, resp);

	}

	// 添加商品
	@RequestMapping("add")
	private void add(
			HttpServletRequest req,
			HttpServletResponse resp,
			@RequestParam(value = "pic", required = false) MultipartFile product_pic)
			throws Exception, IOException {
		// 接收商品图片MultipartFile product_pic

		// 设置字符编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");

		// 获取商品添加信息
		String productname = req.getParameter("product_name");
		String cat_id = req.getParameter("cat_id");
		String sale_price = req.getParameter("sale_price");
		String product_desc = req.getParameter("product_desc");

		Product product = new Product();
		product.setProduct_name(productname);
		product.setCat_id(Integer.parseInt(cat_id));
		product.setSale_price(Integer.parseInt(sale_price));
		product.setDescription(product_desc);

		// 获取原始图片名称
		String originalFilename = product_pic.getOriginalFilename();
		// 上传图片
		if (product_pic != null && originalFilename != null
				&& originalFilename.length() > 0) {

			// 存储图片的物理路径
			String pic_path = "C:\\Users\\Administrator\\eclipse-workspace\\Shop\\src\\main\\webapp\\image";

			// 新的图片名称
			String newFileName = UUID.randomUUID()
					+ originalFilename.substring(originalFilename
							.lastIndexOf("."));
			// 新图片
			File newFile = new File(pic_path + newFileName);

			// 将内存中的数据写入磁盘
			product_pic.transferTo(newFile);

			// 将新图片名称写到itemsCustom中
			product.setPicture_file(newFileName);
			productService.add(product);
		} else {
			productService.add(product);
		}
	}

	// 获取用户地址信息，获取商品详情页
	@RequestMapping("productshow")
	public ModelAndView productShow(ModelAndView modelAndView,
			HttpServletRequest req) {
		CustomerDeve customerDeve = (CustomerDeve) req.getSession()
				.getAttribute("customerDeveInfo");
		
		//获取用户地址
		if (customerDeve != null) {
			List<Customeraddress> customerAddress = customerAddressService
					.findAddressByCustomerId(customerDeve.getId());

			// 判断是否有地址
			if (customerAddress.size() == 0) {
				req.getSession().setAttribute("customerAddress", null);
			} else {
				req.getSession().setAttribute("customerAddress",
						customerAddress);
			}

		}
		// 根据请求的id来查询商品信息
		String id = req.getParameter("id");
		Product product = productService.findProductById(Integer.parseInt(id));
		// 保存到modelandview中
		modelAndView.addObject("product", product);
		modelAndView.setViewName("xiangqing");
		return modelAndView;

	}
	
	@RequestMapping("moreProduct")
	public void moreProduct(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		
		
		
		// 获取总商品的条数
		int productCount = productService.findCount();
		//调用分页方法
		SomeUtils.paging(productCount, 10, req, resp);
		
		//跳转页面
		req.getRequestDispatcher("liebiao.jsp").forward(req, resp);
		req.getSession().removeAttribute("beginProduct");
	}
	
	@RequestMapping("findProduct")
	public void findProduct(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		//获取关键字
		String keyWord = req.getParameter("keyWord");
		if(keyWord==null||keyWord==""){
			keyWord  = (String) req.getSession().getAttribute("keyWord");
		}
			//根据关键字查询
			List<Product> productFind = productService.findByName(keyWord);
			//获取查询的条数
			int count = productService.findKeyWordCount(keyWord );
			SomeUtils.paging(count, 10, req, resp);
			//调用分页方法
			req.getSession().setAttribute("productFind", productFind);
			req.getRequestDispatcher("findResult.jsp").forward(req, resp);
			req.getSession().removeAttribute("beginProduct");
			req.getSession().setAttribute("keyWord", keyWord);
		}
		
		

}
