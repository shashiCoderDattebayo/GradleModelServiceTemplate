package com.company.problem.services.impl;

import com.company.problem.models.SampleModel;
import com.company.problem.services.SampleService;

public class SampleServiceImpl implements SampleService {
    @Override
    public SampleModel getSample(int y) {
        return new SampleModel(y);
    }
}
