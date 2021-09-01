package fpt.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fpt.fa.model.KhachHangModel;
import fpt.fa.repository.LoaiKhachHangDao;
import fpt.fa.service.KhachHangService;

@Controller
public class KhachHangController {

	@Autowired
	private KhachHangService khachHangService;
	
	@Autowired
	private LoaiKhachHangDao loaiKhachHangDao;

	@RequestMapping(value = { "/themKhachHang" }, method = RequestMethod.GET)
	public String showThemKhachHang(Model model) {

		model.addAttribute("KhachHang", new KhachHangModel());

		return "themKhachHang";
	}

	@RequestMapping(value = { "/themKhachHang" }, method = RequestMethod.POST)
	public String themKhachHang(Model model, @ModelAttribute("KhachHang") KhachHangModel khachHangModel) {

		if (loaiKhachHangDao.getById(khachHangModel.getMaLoaiKH()) == null) {
			model.addAttribute("messLoiMaLoaiKH", "Không tồn tại thông tin mã loại khách hàng");
			return "themKhachHang";
		}else {
			khachHangService.insert(khachHangModel);
		}

		return "redirect:homeKhachHang";
	}

	@RequestMapping(value = { "/editKhachHang/{id}" }, method = RequestMethod.GET)
	public String showEditKhachHang(@PathVariable("id") String id, Model model) {
		
		KhachHangModel khachHangModel = khachHangService.getById(id);

		model.addAttribute("KhachHang", khachHangModel);

		return "editKhachHang";
	}

	@RequestMapping(value = { "/updateKhachHang" }, method = RequestMethod.POST)
	public String editKhachHang(@ModelAttribute("KhachHang") KhachHangModel khachHangModel, Model model) {

		khachHangService.update(khachHangModel);

		return "redirect:homeKhachHang";
	}
}
