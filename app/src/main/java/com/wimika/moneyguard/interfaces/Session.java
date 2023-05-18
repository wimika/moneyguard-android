package com.wimika.moneyguard.interfaces;

import java.util.List;

import com.wimika.moneyguard.MoneyGuardSdk;
import com.wimika.moneyguard.models.ClaimSummary;
import com.wimika.moneyguard.models.AccountsCoverage;
import com.wimika.moneyguard.models.BillingOption;
import com.wimika.moneyguard.models.ClaimDetail;
import com.wimika.moneyguard.models.CombinedAccountsCoverage;
import com.wimika.moneyguard.models.OnboardingInfo;
import com.wimika.moneyguard.models.PerAccountCoverage;
import com.wimika.moneyguard.models.Policy;
import com.wimika.moneyguard.models.PolicyCancellationAdvisory;
import com.wimika.moneyguard.models.PolicyCancellationReason;
import com.wimika.moneyguard.models.PolicyProposal;
import com.wimika.moneyguard.models.RiskEvent;
import com.wimika.moneyguard.models.SecurityModule;
import com.wimika.moneyguard.models.SecurityModuleSummary;
import com.wimika.moneyguard.models.SessionInfo;
import com.wimika.moneyguard.models.SingleAccountCoverage;
import com.wimika.moneyguard.models.NewClaim;
import com.wimika.moneyguard.models.NewClaimUpdate;
import com.wimika.moneyguard.models.Notification;

/**
 * Interface that represents a Wimika MoneyGuard Session. This interface provides 
 * access to the core MoneyGuard functionality. A session can be obtained by calling
 * the {@link MoneyGuardSdk#initialize(SessionInfo, Client)} initialize} method
 */
public interface Session {

    List<ClaimSummary> getClaimSummaries();

    ClaimDetail getClaim(String claimId);

    ClaimDetail submitClaim(NewClaim newClaim);

    ClaimDetail updateClaim(NewClaimUpdate newClaimUpdate);

    List<OnboardingInfo> getOnboardingInfo();

    List<AccountsCoverage> getAccountsCoverages();

    PolicyProposal requestPolicyProposal(SingleAccountCoverage coverage);

    PolicyProposal requestPolicyProposal(PerAccountCoverage coverage);

    PolicyProposal requestPolicyProposal(CombinedAccountsCoverage coverage);

    PolicyProposal requestPolicyProposal(String existingPolicyNumber, SingleAccountCoverage newCoverage);

    PolicyProposal requestPolicyProposal(String existingPolicyNumber, PerAccountCoverage newCoverage);

    PolicyProposal requestPolicyProposal(String existingPolicyNumber, CombinedAccountsCoverage newCoverage);

    PolicyProposal requestPolicyRenewalPolicyProposal(String policyNumber);
    
    Policy buyPolicy(PolicyProposal proposal, BillingOption billingOption, Boolean autoRenew, String accountToDebit);

    void requestReimbursementForApprovedClaim(String claimId, String bankId, String accountNumber);

    void cancelPolicy(String policyNumber, List<PolicyCancellationReason> reasons);

    List<PolicyCancellationReason>  getPolicyCancellationReasons();

    PolicyCancellationAdvisory getCancellationAdvisory(String policyNumber);

    List<String> getEmailIdentities();

    String addEmailIdentity(String email);

    Boolean validateEmailIdentity(String email, String code);

    void removeEmailIdentity(String email);

    void scanDevice();

    void scanIdentities();

    SecurityModuleSummary getTodaysSecurityModule();

    List<SecurityModuleSummary> getSecurityModules();

    SecurityModule getSecurityModule(String securityModuleId);

    List<Notification> getNotifications(String cursor);

    List<RiskEvent> getRiskEvents(String cursor);

    
}
