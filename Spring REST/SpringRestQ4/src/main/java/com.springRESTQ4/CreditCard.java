package com.springRESTQ4;


	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class CreditCard
	{
	    @RequestMapping(value = "/validate/{cardNo}",method = RequestMethod.GET)   
	    public String validateCreditCard(@PathVariable("cardNo") String cardNo)
	    {
	       Validator cardValidator = new Validator();
	        cardValidator.setCardNo(cardNo);
	        String res = cardValidator.isValidCard();
	        return  res;
	    }

}
