package com.example.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "short_title",
        "api_uri",
        "first_name",
        "middle_name",
        "last_name",
        "suffix",
        "date_of_birth",
        "gender",
        "party",
        "leadership_role",
        "twitter_account",
        "facebook_account",
        "youtube_account",
        "govtrack_id",
        "cspan_id",
        "votesmart_id",
        "icpsr_id",
        "crp_id",
        "google_entity_id",
        "fec_candidate_id",
        "url",
        "rss_url",
        "contact_form",
        "in_office",
        "cook_pvi",
        "dw_nominate",
        "ideal_point",
        "seniority",
        "next_election",
        "total_votes",
        "missed_votes",
        "total_present",
        "last_updated",
        "ocd_id",
        "office",
        "phone",
        "fax",
        "state",
        "senate_class",
        "state_rank",
        "lis_id",
        "missed_votes_pct",
        "votes_with_party_pct",
        "votes_against_party_pct"
})
@Generated("jsonschema2pojo")
public class SenateMembers {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("short_title")
    private String shortTitle;
    @JsonProperty("api_uri")
    private String apiUri;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private Object middleName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("suffix")
    private Object suffix;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("party")
    private String party;
    @JsonProperty("leadership_role")
    private String leadershipRole;
    @JsonProperty("twitter_account")
    private String twitterAccount;
    @JsonProperty("facebook_account")
    private String facebookAccount;
    @JsonProperty("youtube_account")
    private String youtubeAccount;
    @JsonProperty("govtrack_id")
    private String govtrackId;
    @JsonProperty("cspan_id")
    private String cspanId;
    @JsonProperty("votesmart_id")
    private String votesmartId;
    @JsonProperty("icpsr_id")
    private String icpsrId;
    @JsonProperty("crp_id")
    private String crpId;
    @JsonProperty("google_entity_id")
    private String googleEntityId;
    @JsonProperty("fec_candidate_id")
    private String fecCandidateId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("rss_url")
    private String rssUrl;
    @JsonProperty("contact_form")
    private String contactForm;
    @JsonProperty("in_office")
    private Boolean inOffice;
    @JsonProperty("cook_pvi")
    private Object cookPvi;
    @JsonProperty("dw_nominate")
    private Double dwNominate;
    @JsonProperty("ideal_point")
    private Object idealPoint;
    @JsonProperty("seniority")
    private String seniority;
    @JsonProperty("next_election")
    private String nextElection;
    @JsonProperty("total_votes")
    private Integer totalVotes;
    @JsonProperty("missed_votes")
    private Integer missedVotes;
    @JsonProperty("total_present")
    private Integer totalPresent;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("ocd_id")
    private String ocdId;
    @JsonProperty("office")
    private String office;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("fax")
    private Object fax;
    @JsonProperty("state")
    private String state;
    @JsonProperty("senate_class")
    private String senateClass;
    @JsonProperty("state_rank")
    private String stateRank;
    @JsonProperty("lis_id")
    private String lisId;
    @JsonProperty("missed_votes_pct")
    private Double missedVotesPct;
    @JsonProperty("votes_with_party_pct")
    private Double votesWithPartyPct;
    @JsonProperty("votes_against_party_pct")
    private Double votesAgainstPartyPct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public SenateMembers() {
    }

    /**
     *
     * @param lastName
     * @param ocdId
     * @param gender
     * @param twitterAccount
     * @param missedVotesPct
     * @param shortTitle
     * @param totalPresent
     * @param office
     * @param title
     * @param suffix
     * @param votesmartId
     * @param icpsrId
     * @param youtubeAccount
     * @param lastUpdated
     * @param apiUri
     * @param leadershipRole
     * @param totalVotes
     * @param googleEntityId
     * @param id
     * @param state
     * @param govtrackId
     * @param fax
     * @param senateClass
     * @param dwNominate
     * @param missedVotes
     * @param inOffice
     * @param votesAgainstPartyPct
     * @param dateOfBirth
     * @param contactForm
     * @param url
     * @param rssUrl
     * @param idealPoint
     * @param firstName
     * @param lisId
     * @param crpId
     * @param fecCandidateId
     * @param phone
     * @param facebookAccount
     * @param cspanId
     * @param stateRank
     * @param votesWithPartyPct
     * @param middleName
     * @param cookPvi
     * @param party
     * @param seniority
     * @param nextElection
     */
    public SenateMembers(String id, String title, String shortTitle, String apiUri, String firstName, Object middleName, String lastName, Object suffix, String dateOfBirth, String gender, String party, String leadershipRole, String twitterAccount, String facebookAccount, String youtubeAccount, String govtrackId, String cspanId, String votesmartId, String icpsrId, String crpId, String googleEntityId, String fecCandidateId, String url, String rssUrl, String contactForm, Boolean inOffice, Object cookPvi, Double dwNominate, Object idealPoint, String seniority, String nextElection, Integer totalVotes, Integer missedVotes, Integer totalPresent, String lastUpdated, String ocdId, String office, String phone, Object fax, String state, String senateClass, String stateRank, String lisId, Double missedVotesPct, Double votesWithPartyPct, Double votesAgainstPartyPct) {
        super();
        this.id = id;
        this.title = title;
        this.shortTitle = shortTitle;
        this.apiUri = apiUri;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.party = party;
        this.leadershipRole = leadershipRole;
        this.twitterAccount = twitterAccount;
        this.facebookAccount = facebookAccount;
        this.youtubeAccount = youtubeAccount;
        this.govtrackId = govtrackId;
        this.cspanId = cspanId;
        this.votesmartId = votesmartId;
        this.icpsrId = icpsrId;
        this.crpId = crpId;
        this.googleEntityId = googleEntityId;
        this.fecCandidateId = fecCandidateId;
        this.url = url;
        this.rssUrl = rssUrl;
        this.contactForm = contactForm;
        this.inOffice = inOffice;
        this.cookPvi = cookPvi;
        this.dwNominate = dwNominate;
        this.idealPoint = idealPoint;
        this.seniority = seniority;
        this.nextElection = nextElection;
        this.totalVotes = totalVotes;
        this.missedVotes = missedVotes;
        this.totalPresent = totalPresent;
        this.lastUpdated = lastUpdated;
        this.ocdId = ocdId;
        this.office = office;
        this.phone = phone;
        this.fax = fax;
        this.state = state;
        this.senateClass = senateClass;
        this.stateRank = stateRank;
        this.lisId = lisId;
        this.missedVotesPct = missedVotesPct;
        this.votesWithPartyPct = votesWithPartyPct;
        this.votesAgainstPartyPct = votesAgainstPartyPct;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("short_title")
    public String getShortTitle() {
        return shortTitle;
    }

    @JsonProperty("short_title")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    @JsonProperty("api_uri")
    public String getApiUri() {
        return apiUri;
    }

    @JsonProperty("api_uri")
    public void setApiUri(String apiUri) {
        this.apiUri = apiUri;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middle_name")
    public Object getMiddleName() {
        return middleName;
    }

    @JsonProperty("middle_name")
    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("suffix")
    public Object getSuffix() {
        return suffix;
    }

    @JsonProperty("suffix")
    public void setSuffix(Object suffix) {
        this.suffix = suffix;
    }

    @JsonProperty("date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("party")
    public String getParty() {
        return party;
    }

    @JsonProperty("party")
    public void setParty(String party) {
        this.party = party;
    }

    @JsonProperty("leadership_role")
    public String getLeadershipRole() {
        return leadershipRole;
    }

    @JsonProperty("leadership_role")
    public void setLeadershipRole(String leadershipRole) {
        this.leadershipRole = leadershipRole;
    }

    @JsonProperty("twitter_account")
    public String getTwitterAccount() {
        return twitterAccount;
    }

    @JsonProperty("twitter_account")
    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }

    @JsonProperty("facebook_account")
    public String getFacebookAccount() {
        return facebookAccount;
    }

    @JsonProperty("facebook_account")
    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    @JsonProperty("youtube_account")
    public String getYoutubeAccount() {
        return youtubeAccount;
    }

    @JsonProperty("youtube_account")
    public void setYoutubeAccount(String youtubeAccount) {
        this.youtubeAccount = youtubeAccount;
    }

    @JsonProperty("govtrack_id")
    public String getGovtrackId() {
        return govtrackId;
    }

    @JsonProperty("govtrack_id")
    public void setGovtrackId(String govtrackId) {
        this.govtrackId = govtrackId;
    }

    @JsonProperty("cspan_id")
    public String getCspanId() {
        return cspanId;
    }

    @JsonProperty("cspan_id")
    public void setCspanId(String cspanId) {
        this.cspanId = cspanId;
    }

    @JsonProperty("votesmart_id")
    public String getVotesmartId() {
        return votesmartId;
    }

    @JsonProperty("votesmart_id")
    public void setVotesmartId(String votesmartId) {
        this.votesmartId = votesmartId;
    }

    @JsonProperty("icpsr_id")
    public String getIcpsrId() {
        return icpsrId;
    }

    @JsonProperty("icpsr_id")
    public void setIcpsrId(String icpsrId) {
        this.icpsrId = icpsrId;
    }

    @JsonProperty("crp_id")
    public String getCrpId() {
        return crpId;
    }

    @JsonProperty("crp_id")
    public void setCrpId(String crpId) {
        this.crpId = crpId;
    }

    @JsonProperty("google_entity_id")
    public String getGoogleEntityId() {
        return googleEntityId;
    }

    @JsonProperty("google_entity_id")
    public void setGoogleEntityId(String googleEntityId) {
        this.googleEntityId = googleEntityId;
    }

    @JsonProperty("fec_candidate_id")
    public String getFecCandidateId() {
        return fecCandidateId;
    }

    @JsonProperty("fec_candidate_id")
    public void setFecCandidateId(String fecCandidateId) {
        this.fecCandidateId = fecCandidateId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("rss_url")
    public String getRssUrl() {
        return rssUrl;
    }

    @JsonProperty("rss_url")
    public void setRssUrl(String rssUrl) {
        this.rssUrl = rssUrl;
    }

    @JsonProperty("contact_form")
    public String getContactForm() {
        return contactForm;
    }

    @JsonProperty("contact_form")
    public void setContactForm(String contactForm) {
        this.contactForm = contactForm;
    }

    @JsonProperty("in_office")
    public Boolean getInOffice() {
        return inOffice;
    }

    @JsonProperty("in_office")
    public void setInOffice(Boolean inOffice) {
        this.inOffice = inOffice;
    }

    @JsonProperty("cook_pvi")
    public Object getCookPvi() {
        return cookPvi;
    }

    @JsonProperty("cook_pvi")
    public void setCookPvi(Object cookPvi) {
        this.cookPvi = cookPvi;
    }

    @JsonProperty("dw_nominate")
    public Double getDwNominate() {
        return dwNominate;
    }

    @JsonProperty("dw_nominate")
    public void setDwNominate(Double dwNominate) {
        this.dwNominate = dwNominate;
    }

    @JsonProperty("ideal_point")
    public Object getIdealPoint() {
        return idealPoint;
    }

    @JsonProperty("ideal_point")
    public void setIdealPoint(Object idealPoint) {
        this.idealPoint = idealPoint;
    }

    @JsonProperty("seniority")
    public String getSeniority() {
        return seniority;
    }

    @JsonProperty("seniority")
    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    @JsonProperty("next_election")
    public String getNextElection() {
        return nextElection;
    }

    @JsonProperty("next_election")
    public void setNextElection(String nextElection) {
        this.nextElection = nextElection;
    }

    @JsonProperty("total_votes")
    public Integer getTotalVotes() {
        return totalVotes;
    }

    @JsonProperty("total_votes")
    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    @JsonProperty("missed_votes")
    public Integer getMissedVotes() {
        return missedVotes;
    }

    @JsonProperty("missed_votes")
    public void setMissedVotes(Integer missedVotes) {
        this.missedVotes = missedVotes;
    }

    @JsonProperty("total_present")
    public Integer getTotalPresent() {
        return totalPresent;
    }

    @JsonProperty("total_present")
    public void setTotalPresent(Integer totalPresent) {
        this.totalPresent = totalPresent;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("ocd_id")
    public String getOcdId() {
        return ocdId;
    }

    @JsonProperty("ocd_id")
    public void setOcdId(String ocdId) {
        this.ocdId = ocdId;
    }

    @JsonProperty("office")
    public String getOffice() {
        return office;
    }

    @JsonProperty("office")
    public void setOffice(String office) {
        this.office = office;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("fax")
    public Object getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(Object fax) {
        this.fax = fax;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("senate_class")
    public String getSenateClass() {
        return senateClass;
    }

    @JsonProperty("senate_class")
    public void setSenateClass(String senateClass) {
        this.senateClass = senateClass;
    }

    @JsonProperty("state_rank")
    public String getStateRank() {
        return stateRank;
    }

    @JsonProperty("state_rank")
    public void setStateRank(String stateRank) {
        this.stateRank = stateRank;
    }

    @JsonProperty("lis_id")
    public String getLisId() {
        return lisId;
    }

    @JsonProperty("lis_id")
    public void setLisId(String lisId) {
        this.lisId = lisId;
    }

    @JsonProperty("missed_votes_pct")
    public Double getMissedVotesPct() {
        return missedVotesPct;
    }

    @JsonProperty("missed_votes_pct")
    public void setMissedVotesPct(Double missedVotesPct) {
        this.missedVotesPct = missedVotesPct;
    }

    @JsonProperty("votes_with_party_pct")
    public Double getVotesWithPartyPct() {
        return votesWithPartyPct;
    }

    @JsonProperty("votes_with_party_pct")
    public void setVotesWithPartyPct(Double votesWithPartyPct) {
        this.votesWithPartyPct = votesWithPartyPct;
    }

    @JsonProperty("votes_against_party_pct")
    public Double getVotesAgainstPartyPct() {
        return votesAgainstPartyPct;
    }

    @JsonProperty("votes_against_party_pct")
    public void setVotesAgainstPartyPct(Double votesAgainstPartyPct) {
        this.votesAgainstPartyPct = votesAgainstPartyPct;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}