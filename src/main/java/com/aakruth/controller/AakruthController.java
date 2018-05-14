package com.aakruth.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aakruth.dao.DealerService;
import com.aakruth.dao.PurchaseService;
import com.aakruth.dao.RoleService;
import com.aakruth.dao.SaleService;
import com.aakruth.dao.UserService;
import com.aakruth.model.DealerDisplay;
import com.aakruth.model.PurchaseChart;
import com.aakruth.model.PurchaseDisplay;
import com.aakruth.model.RoleTbl;
import com.aakruth.model.SaleChart;
import com.aakruth.model.SalesDisplay;
import com.aakruth.model.UsrTbl;

@Controller
public class AakruthController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SaleService saleService;

	@Autowired
	private PurchaseService purchaseService;

	@Autowired
	private DealerService dealerService;

	@Autowired
	UserService userService;

	@Autowired
	RoleService roleService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model, Principal principal) {
		int saleCount = 0, sale = 0, purchaseCount = 0, purchase = 0, customers = 0, builders = 0;
		String email = principal.getName();
		UsrTbl user = userService.findUserByEmail(email);
		RoleTbl role = roleService.findByUsrTbl(user);
		if (role.getRole().equals("ADMIN")) {
			List<PurchaseDisplay> purs = purchaseService.findPurchaseDisplay();
			List<SalesDisplay> sales = saleService.findSalesDisplay();
			List<DealerDisplay> dealers = dealerService.findDealerDisplay();
			for(PurchaseDisplay pur : purs){
				purchase++;
				purchaseCount+=pur.getCnt();
			}
			for(SalesDisplay sal : sales){
				sale++;
				saleCount+=sal.getCnt();
			}
			for(DealerDisplay dealer : dealers){
				if(dealer.getType()=='C')
					customers++;
				else if(dealer.getType()=='B')
					builders++;
			}
		} else {
			List<SalesDisplay> sales = saleService.findSalesDisplay(user);
			for(SalesDisplay sal : sales){
				sale++;
				saleCount+=sal.getCnt();
			}
		}

		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("saleCount", saleCount);
		model.addAttribute("sale", sale);
		model.addAttribute("purchaseCount", purchaseCount);
		model.addAttribute("purchase", purchase);
		model.addAttribute("customers", customers);
		model.addAttribute("builders", builders);
		model.addAttribute("name", name);
		logger.info(name + " views AakruthHome page");
		return "AakruthHome";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getProduct(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthProduct page");
		return "AakruthProduct";
	}

	@RequestMapping(value = "/builder", method = RequestMethod.GET)
	public String getBuilder(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthBuilder page");
		return "AakruthBuilder";
	}

	@RequestMapping(value = "/sale", method = RequestMethod.GET)
	public String getSales(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthSale page");
		return "AakruthSales";
	}

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String getAccounts(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthAccounting page");
		return "AakruthAccounting";
	}

	@RequestMapping(value = "/purchase", method = RequestMethod.GET)
	public String getPurchase(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthPurchase page");
		return "AakruthPurchase";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthCustomer page");
		return "AakruthCustomer";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUser(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthUser page");
		return "AakruthUser";
	}
	
	@RequestMapping(value = "/inventory", method = RequestMethod.GET)
	public String getInventory(ModelMap model, Principal principal) {
		String name = principal.getName(); // get logged in username
		name = name.substring(0,name.indexOf("@"));
		model.addAttribute("name", name);
		logger.info(name + " views AakruthInventory page");
		return "AakruthInventory";
	}

}
