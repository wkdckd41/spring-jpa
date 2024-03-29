package com.study.ex02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CourseRequestDto {
    private final String title;
    private final String tutor;
}
