package com.example.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operations {
	
	@GetMapping("/add/{value1}/{value2}")
	public Result add(@PathVariable int value1, @PathVariable int value2) {
		int sum = value1 +value2;
		Result result = new Result();
		result.setSum(sum);
	    return result;

	}
	
	@GetMapping("/sub/{value1}/{value2}")
	public Result sub(@PathVariable int value1, @PathVariable int value2) {
		int sum = value1 - value2;
		Result result = new Result();
		result.setSum(sum);
	    return result;

	}
	
	@GetMapping("/mul/{value1}/{value2}")
	public Result mul(@PathVariable int value1, @PathVariable int value2) {
		int sum = value1 * value2;
		Result result = new Result();
		result.setSum(sum);
	    return result;

	}
	
	@PostMapping("/add")
	public Result postAdd(@RequestBody AddRequest addRequest) {
		int sum = addRequest.getParam1() + addRequest.getParam2();
		System.out.println("tested");
		Result result = new Result();
		result.setSum(sum);
		//System.out.println(addRequest.getParam1());
	    return result;

		
	}
	
	@PostMapping("/sub")
	public Result postSub(@RequestBody AddRequest addRequest) {
	
		int sum = addRequest.getParam1() + addRequest.getParam2();
		System.out.println("tested");
		
		Result result = new Result();
		result.setSum(sum);
		System.out.println(addRequest.getParam1());
		System.out.println(addRequest.getParam2());
		System.out.println(sum);
	    return result;

		
	}
	
	@PostMapping("/mul")
	public Result postMul(@RequestBody AddRequest addRequest) {
		int sum = addRequest.getParam1() * addRequest.getParam2();
		Result result = new Result();
		result.setSum(sum);
	    return result;

	}
	@PostMapping("/postAdd")
	public Result posta(@RequestBody AddRequest addRequest) {
		int sum = addRequest.getParam3() - addRequest.getParam4();
		System.out.println("tested23");
		Result result = new Result();
		result.setSum(sum);
		//System.out.println(addRequest.getParam1());
	    return result;
	}
	@PostMapping("/postSub")
	public Result posts(@RequestBody AddRequest addRequest) {
		int sum = addRequest.getParam3() - addRequest.getParam4();
		System.out.println("tested23");
		Result result = new Result();
		result.setSum(sum);
		//System.out.println(addRequest.getParam1());
	    return result;
}
	@PostMapping("/postMul")
	public Result postm(@RequestBody AddRequest addRequest) {
		int sum = addRequest.getParam3() * addRequest.getParam4();
		System.out.println("tested23");
		Result result = new Result();
		result.setSum(sum);
		//System.out.println(addRequest.getParam1());
	    return result;
}
	
}
