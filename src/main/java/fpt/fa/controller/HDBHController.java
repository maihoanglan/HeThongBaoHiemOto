package fpt.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fpt.fa.model.HopDongModel;
import fpt.fa.repository.KhachHangDao;
import fpt.fa.service.HDBHService;

@Controller
public class HDBHController {

	@Autowired
	private HDBHService hDBHService;

	@Autowired
	private KhachHangDao khachHangDao;

	/**
	 * Show trang them HDBH Chuyen ve mang hinh Home
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/themHDBH" }, method = RequestMethod.GET)
	public String showThemHDBH(Model model) {
		
		model.addAttribute("HDBH", new HopDongModel());
		
		return "themHDBH";
	}

	/**
	 * Thuc hien insert DB
	 * 
	 * @param model
	 * @param hopDongModel
	 * @return
	 */
	@RequestMapping(value = { "/themHDBH" }, method = RequestMethod.POST)
	public String themHDBH(Model model, @ModelAttribute("HDBH") HopDongModel hopDongModel) {
		
		if (khachHangDao.getById(hopDongModel.getMaKH()) == null) {
			model.addAttribute("messLoiMaKH", "Không tồn tại thông tin khách hàng trong hệ thống");
			return "themHDBH";
		} else {
			hDBHService.insert(hopDongModel);
		}

		return "redirect:home";
	}

	@RequestMapping(value = { "/editHDBH/{id}" }, method = RequestMethod.GET)
	public String showEditHDBH(@PathVariable("id") String id, Model model) {
		
		HopDongModel hopDongModel = hDBHService.getById(id);

		model.addAttribute("HDBH", hopDongModel);

		return "editHDBH";
	}

	@RequestMapping(value = { "/update" }, method = RequestMethod.POST)
	public String editHDBH(@ModelAttribute("HDBH") HopDongModel hopDongModel, Model model) {
		
		hDBHService.update(hopDongModel);

		return "redirect:home";
	}

}
