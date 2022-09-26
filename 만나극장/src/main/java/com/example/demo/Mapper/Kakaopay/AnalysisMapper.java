package com.example.demo.Mapper.Kakaopay;


import com.example.demo.VO.Kakaopay.AnalysisDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnalysisMapper {

    AnalysisDTO getAmount();


}
