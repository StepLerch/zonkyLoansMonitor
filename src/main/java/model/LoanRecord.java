package model;

import java.math.BigDecimal;
import java.util.List;

import enums.Purpose;

public class LoanRecord {

	private Long id;
	private String url;
	private String name;
	private String story;
	private Purpose purpose;
	private List<Photo> photos;
	private long userId;
	private String nickName;
	private int termInMonths;
	private BigDecimal interestRate;
	private BigDecimal revenueRate;
	private BigDecimal annuity;
	private BigDecimal premium;
	private String rating;
	private boolean topped;
	private BigDecimal amount;
	private String currency;
	private BigDecimal remainingInvestment;
	private BigDecimal reservedAmount;
	private BigDecimal investmentRate;
	private boolean covered;
	private String datePublished;
	private boolean published;
	private String deadline;
	private int investmentsCount;
	private int questionCount;
	private String region;
	private String mainIncomeType;
	private boolean insuranceActive;
	private List<InsuranceHistory> insuranceHistory;

	public String getShortMsg() {
		return "LoanRecord [id=" + id + ", userId=" + userId + ", nickName=" + nickName + ", termInMonths="
				+ termInMonths + ", interestRate=" + interestRate + ", revenueRate=" + revenueRate + ", annuity="
				+ annuity + ", premium=" + premium + ", rating=" + rating + ", topped=" + topped + ", amount=" + amount
				+ "]";
	}

	@Override
	public String toString() {
		return "LoanRecord [id=" + id + ", name=" + name + ", story=" + story + ", userId=" + userId + ", nickName="
				+ nickName + ", termInMonths=" + termInMonths + ", interestRate=" + interestRate + ", revenueRate="
				+ revenueRate + ", annuity=" + annuity + ", premium=" + premium + ", rating=" + rating + ", topped="
				+ topped + ", amount=" + amount + "]";
	}

}
