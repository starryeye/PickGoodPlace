package com.example.goodPlace.favorplace.entity;

import com.example.goodPlace.repository.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class FavorPlaceEntity extends MemoryDbEntity {

    private String category;                    // 즐겨찾는 장소 카테고리
    private String title;                       // 장소명

    private String homePage;                    // 홈페이지 주소
    private String image;                       // 이미지

    private String address;                     // 주소
    private String roadAddress;                 // 도로명 주소

    private int visitCount;                     // 방문 횟수
    private boolean isVisit;                    // 방문 유무
    private LocalDateTime recentVisitDate;      // 최근 방문 날짜
}
