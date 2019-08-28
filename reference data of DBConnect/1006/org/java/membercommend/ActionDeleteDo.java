package org.java.membercommend;

import java.util.Scanner;

import org.java.memberdao.MemberDao;

public class ActionDeleteDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("È¸¿ø Å»Åð Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("¾ÆÀÌµð ÀÔ·Â:");
		String userId = scn.next();

		MemberDao dao = new MemberDao();
		int result = dao.deleteDo(userId);
		if (result == 1) {
			System.out.println("È¸¿ø Å»Åð ¼º°ø");
		} else {
			System.out.println("È¸¿ø Å»Åð ½ÇÆÐ");
		}

	}
}
