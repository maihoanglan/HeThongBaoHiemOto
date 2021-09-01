
package fpt.fa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fpt.fa.entities.HopDongBaoHiem;
import fpt.fa.entities.KhachHang;
import fpt.fa.model.KhachHangModel;
import fpt.fa.service.HDBHService;
import fpt.fa.service.KhachHangService;

@Controller
public class HomeController {

	@Autowired
	private HDBHService hDBHService;

	@Autowired
	private KhachHangService khachHangService;

	@RequestMapping(value = { "home", "/" }, method = RequestMethod.GET)
	public String showHome(Model model, HttpServletRequest request) {

		List<HopDongBaoHiem> listBaoHiems = null;
		String check = request.getParameter("hetHan");
		if ("1".equals(check)) {
			listBaoHiems = hDBHService.getAll(check);
		} else {
			listBaoHiems = hDBHService.getAll();
		}

		model.addAttribute("listBaoHiems", listBaoHiems);

		return "Home";
	}

	@RequestMapping(value = { "/homeKhachHang" }, method = RequestMethod.GET)
	public String showHomeKhachHang(Model model, HttpServletRequest request) {

		List<KhachHang> listKhachHangs = null;
		String name = request.getParameter("tenKH");
		if (name == null) {
			listKhachHangs = khachHangService.getAll();
		} else {
			KhachHang khachHang = new KhachHang();
			khachHang.setTenKH(name);
			listKhachHangs = khachHangService.getAll(khachHang);
		}

		model.addAttribute("listKhachHangs", listKhachHangs);

		return "HomeKhachHang";
	}

}
