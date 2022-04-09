package com.springin.homework.service;

import com.springin.homework.model.MathRequest;
import com.springin.homework.model.ResultResponse;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    public ResultResponse getResult(MathRequest mathRequest){
        ResultResponse response = new ResultResponse();
        Integer result;

        switch (mathRequest.getOperation()){
            case "sum": result = Math.addExact(mathRequest.getFirstNumber(), mathRequest.getSecondNumber());
                break;
            case "difference": result = Math.subtractExact(mathRequest.getFirstNumber(), mathRequest.getSecondNumber());
                break;
            case "multiply": result = Math.multiplyExact(mathRequest.getFirstNumber(), mathRequest.getSecondNumber());
                break;
            case "divide": result = Math.floorDiv(mathRequest.getFirstNumber(), mathRequest.getSecondNumber());
                break;
            case "power": result = (int) Math.pow(mathRequest.getFirstNumber(), mathRequest.getSecondNumber());
                break;
            default:throw new ArithmeticException("this operation is not valid");
        }
        response.setResult(result);
        return response;
    }
}
