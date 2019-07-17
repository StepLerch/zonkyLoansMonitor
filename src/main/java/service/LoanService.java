package service;

import java.util.Arrays;
import java.util.List;

import enums.SiteMap;
import model.LoanRecord;

public class LoanService {

	private static LoanService instance;

	public static LoanService getInstance() {
		if (instance == null) {
			instance = new LoanService();
		}
		return instance;
	}

	public List<LoanRecord> getLoanRecordList(SiteMap site) {
		return Arrays.asList(JsonService.getObjectFromUrl(LoanRecord[].class, site.getUrl()));
	}
}
