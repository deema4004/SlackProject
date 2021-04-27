package com.mttc.slackService;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Getter
@Setter
public class SlackMessage implements Serializable {

  private String seriesTitle;
  private String episodeTitle;
  private Long episodeNo;
  private Long orderId;
  private Long cbsId;
  
}
