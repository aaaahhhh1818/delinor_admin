package com.noriteo.delinori.saleboard.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reply {

    private Long rno;
    private Long sno;
    private String replyer;
    private String reply;
    private LocalDateTime reply_date;
    private LocalDateTime mod_date;
    private Long gno;

}
