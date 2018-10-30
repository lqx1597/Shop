package cn.shop.contorller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeUtils {

	// 验证码功能
	@RequestMapping("login")
	public static void ran(HttpServletRequest req, HttpServletResponse resp) {

		// 设置图片宽度和高度
		int width = 100;
		int height = 45;
		// 干扰线条数
		int lines = 10;
		// 验证码数组
		int[] random = new int[4];
		// 定义用户保存验证码
		String sysCode = "";
		Random r = new Random();
		BufferedImage b = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = b.getGraphics();
		g.setFont(new Font("宋体", Font.BOLD, 30));
		for (int i = 0; i < 4; i++) {
			int number = r.nextInt(10);
			random[i] = number;
			int y = 10 + r.nextInt(40);// 10~40范围内的一个整数，作为y坐标
			// 随机颜色，RGB模式
			Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			g.setColor(c);
			// g.drawString("" + a, 5 + i * width / 4, y);
			// 写验证码
			g.drawString(Integer.toString(number), 5 + i * width / 4, y);
			sysCode += random[i];
		}
		req.getSession().setAttribute("sysCode", sysCode);

		for (int i = 0; i < lines; i++) {
			// 设置干扰线颜色
			Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			g.setColor(c);
			g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width),
					r.nextInt(height));
		}
		try {
			// 清空缓冲
			g.dispose();
			// 向文件中写入
			// ImageIO.write(b, "jpg", new File("F:\\image\\test.jpg"));

			ImageIO.write(b, "JPEG", resp.getOutputStream());
			// ImageIO.write(b, "jpg", new File("./WebContent/aaa/test.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	// 定义用于进行分页的方法
	public static void paging(int count, int pageSize, HttpServletRequest req,
			HttpServletResponse resp) {

		/* 进行分页 */
		// 一页的商品条数
		// 将pageSize，count保存到session中
		req.getSession().setAttribute("pageSize", pageSize);
		req.getSession().setAttribute("count", count);
		// 一共多少页
		int totalpage = count / pageSize + (count % pageSize > 0 ? 1 : 0);
		System.out.println("一共多少页" + totalpage);
		req.getSession().setAttribute("totalpage", totalpage);

		// 获取传递过来的页数
		int pageNo = 1;
		if (req.getParameter("pageNo") != null
				&& req.getParameter("pageNo") != "") {
			pageNo = Integer.parseInt(req.getParameter("pageNo"));
		}
		if (pageNo < 1) {
			pageNo = 1;
		}
		if (pageNo >= totalpage) {
			pageNo = totalpage;
		}

		// 定义遍历商品开始时的序号
		int beginProduct = (pageNo - 1) * pageSize;
		req.getSession().setAttribute("beginProduct", beginProduct);
		// 定义遍历商品结束的序号
		int endProduct = pageNo * pageSize - 1;
		req.getSession().setAttribute("endProduct", endProduct);
		req.getSession().setAttribute("pageNo", pageNo);

	}
	
	
	//弹出对话框与跳转页面功能
	public static void alertMes(HttpServletRequest req,HttpServletResponse resp,String mes,String page) throws IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		writer.write("<script>alert('"+mes+"');</script>");
		writer.write("<script>window.location.href='"+page+"';</script>");
		writer.close();
		writer.flush();
	}
}
