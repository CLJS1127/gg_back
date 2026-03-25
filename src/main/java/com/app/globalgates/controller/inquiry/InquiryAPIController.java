package com.app.globalgates.controller.inquiry;

import com.app.globalgates.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inqury-list/**")
@RequiredArgsConstructor
@Slf4j
public class InquiryAPIController {
    private final MemberService memberService;


}
