package com.little.g.demo;

import com.little.g.common.error.ErrorCodeDiv;
import com.little.g.common.error.ErrorCodes;

/**
 * Created by lengligang on 2019/3/12.
 */
public class DemoErrorCodes extends ErrorCodes{

    public static final Integer INVALID_PARAM = 20000;


    public DemoErrorCodes() {
        super(ErrorCodeDiv.DEMO);
    }

    @Override
    protected void addCodes() {
        addCode2Map(INVALID_PARAM,"param invalid");
    }
}
