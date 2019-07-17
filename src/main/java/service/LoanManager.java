package service;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import enums.SiteMap;
import model.LoanRecord;

/**
 * Singleton class for handling loan records
 */
public class LoanManager {

	final Logger log = Logger.getLogger(LoanManager.class);
	private static LoanManager instance;

	public static LoanManager getInstance() {
		if (instance == null) {
			instance = new LoanManager();
		}
		return instance;
	}

	/**
	 * 
	 * @return all unsorted loans as list
	 */
	public List<LoanRecord> getAllLoans() {
		return LoanService.getInstance().getLoanRecordList(SiteMap.ZONKY_MP_LOANS);
	}

	/**
	 * 
	 * @return all unsorted loans as String
	 */
	public List<String> getAllLoansAsShortString() {
		List<LoanRecord> loansList = this.getAllLoans();
		List<String> result = new ArrayList<>(loansList.size());
		for (LoanRecord loanRecord : loansList) {
			result.add(loanRecord.getShortMsg());
		}
		return result;
	}
}
