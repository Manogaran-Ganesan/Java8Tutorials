package java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VoterPerdicate {

	// predicate who are male and age more than 18

	public static Predicate<VotersBean> maleVoter() {

		return p -> p.getAge() > 17 && p.getGender().equalsIgnoreCase("M");

	}

	// predicate who are female and age more than 18

	public static Predicate<VotersBean> femaleVoter() {

		return p -> p.getAge() > 17 && p.getGender().equalsIgnoreCase("F");
	}

	// predicate whose age is more than a given age

	public static Predicate<VotersBean> ageCheck(int input) {

		return p -> p.getAge() < 17;

	}

	public static List<VotersBean> filterVoters(List<VotersBean> VotersBean, Predicate<VotersBean> Perdicate) {

		return VotersBean.stream().filter(Perdicate).collect(Collectors.<VotersBean>toList());

	}
}
