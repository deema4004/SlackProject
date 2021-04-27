package com.mttc.slackService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlackMessage slackMessage = SlackMessage.builder()
				.seriesTitle("xyz")
				.episodeTitle("XZY")
				.cbsId(123L)
				.episodeNo(12L)
				.orderId(103L)
				.build();
		
		SlackService.sendMessage(slackMessage);
	}

}
