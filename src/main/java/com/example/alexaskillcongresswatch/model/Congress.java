package com.example.alexaskillcongresswatch.model;


public class Congress {

    private String voteData;
    private String memberData;
    private String billData;
    private String nominationData;
    private String committeeData;
    private String statementData;
    private String lobbyingData;
    private String otherData;

    public Congress() {
    }

    public Congress(String voteData, String memberData, String billData, String nominationData, String committeeData, String statementData, String lobbyingData, String otherData) {
        this.voteData = voteData;
        this.memberData = memberData;
        this.billData = billData;
        this.nominationData = nominationData;
        this.committeeData = committeeData;
        this.statementData = statementData;
        this.lobbyingData = lobbyingData;
        this.otherData = otherData;
    }

    public String getVoteData() {
        return voteData;
    }

    public void setVoteData(String voteData) {
        this.voteData = voteData;
    }

    public String getMemberData() {
        return memberData;
    }

    public void setMemberData(String memberData) {
        this.memberData = memberData;
    }

    public String getBillData() {
        return billData;
    }

    public void setBillData(String billData) {
        this.billData = billData;
    }

    public String getNominationData() {
        return nominationData;
    }

    public void setNominationData(String nominationData) {
        this.nominationData = nominationData;
    }

    public String getCommitteeData() {
        return committeeData;
    }

    public void setCommitteeData(String committeeData) {
        this.committeeData = committeeData;
    }

    public String getStatementData() {
        return statementData;
    }

    public void setStatementData(String statementData) {
        this.statementData = statementData;
    }

    public String getLobbyingData() {
        return lobbyingData;
    }

    public void setLobbyingData(String lobbyingData) {
        this.lobbyingData = lobbyingData;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "Congress{" +
                "voteData='" + voteData + '\'' +
                ", memberData='" + memberData + '\'' +
                ", billData='" + billData + '\'' +
                ", nominationData='" + nominationData + '\'' +
                ", committeeData='" + committeeData + '\'' +
                ", statementData='" + statementData + '\'' +
                ", lobbyingData='" + lobbyingData + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}
