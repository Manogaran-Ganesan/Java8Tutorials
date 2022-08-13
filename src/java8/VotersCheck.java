package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VotersCheck {

	public static void main(String[] args) {

		VotersBean v1 = new VotersBean("rajini", 29, "M");
		VotersBean v2 = new VotersBean("mano", 27, "M");
		VotersBean v3 = new VotersBean("murali", 24, "M");
		VotersBean v4 = new VotersBean("ramya", 29, "F");
		VotersBean v5 = new VotersBean("raghu", 28, "M");
		VotersBean v6 = new VotersBean("seenu", 25, "M");
		VotersBean v7 = new VotersBean("latha", 20, "F");
		VotersBean v8 = new VotersBean("nadhiya", 30, "F");
		VotersBean v9 = new VotersBean("divya", 25, "F");
		VotersBean v10 = new VotersBean("pranav", 6, "M");

		List<VotersBean> votersBean = new ArrayList<VotersBean>();

		votersBean.addAll(Arrays.asList(new VotersBean[] { v1, v2, v3, v4, v5, v6, v7, v8, v9, v10 }));

		System.out.println("Male Voters :"+VoterPerdicate.filterVoters(votersBean, VoterPerdicate.maleVoter()));
		System.out.println("FeMale Voters :"+VoterPerdicate.filterVoters(votersBean, VoterPerdicate.femaleVoter()));
		System.out.println("Check Voters :"+VoterPerdicate.filterVoters(votersBean, VoterPerdicate.ageCheck(18)));

	}

}
