package th.co.eecsv.entity;

import java.io.Serializable;

public class MasterElderlyPerson implements Serializable{

private static final long serialVersionUID = 1742483745391216484L;

    private String codeId;
    private String mappingCode;
    private String areaId;
    private String surveyName;
    private String surveyDate;
    private String surveyStartTime;
    private String surveyEndTime;
    private String gender;
    private String birthday;
    private String weight;
    private String height;
    private String waistline;
    private String memberTotal;
    private String memberEarnMoney;
    private String memberTakecare;
    private String education;
    private String maritalStatus;
    private String maritalStatusOth;
    private String medical;
    private String medicalOth;
    private String residential;
    private String houseLive;
    private String houseBelong;
    private String houseBelongOth;
    private String bedroom;
    private String restroom;
    private String useSmartphone;
    private String helpOrg;
    private String helpSkill;
    private String helpMedical;
    private String helpOrgOth;
    private String incomeTotal;
    private String incomeSource;
    private String incomeOth;
    private String expendAvg;
    private String expendHealthYear;
    private String incomeEnough;
    private String careerFlag;
    private String careerCurrent;
    private String careerCurrentOth;
    private String incomeMainTotal;
    private String incomeAmt;
    private String incomeDetail;
    private String incomeDetailOth;
    private String workWeekHr;
    private String distantKm;
    private String distantM;
    private String durationHr;
    private String durationMin;
    private String workPlace;
    private String workTravelType;
    private String workTravelOth;
    private String accident;
    private String accidentDetail;
    private String needJob;
    private String needJobHr;
    private String wagesFlag;
    private String wagesExpect;
    private String jobExpect;
    private String noNeedJobReason;
    private String noNeedJobOth;
    private String workFor;
    private String workForOth;
    private String expectCareerGroup;
    private String expectCareerOth;
    private String expectJobHr;
    private String expectWagesHrType;
    private String expectWagesHr;
    private String specWork;
    private String canWork;
    private String canWorkOth;
    private String workLocation;
    private String canTravelSelf;
    private String canTravelSelfOth;
    private String workDaytime;
    private String workNight;
    private String canRun;
    private String canArm;
    private String canShrink;
    private String canSee;
    private String skillSpecial;
    private String skillSpecialOth;
    private String skillSpecialDetail;
    private String stsSleep;
    private String stsConcentration;
    private String stsEDGY;
    private String stsBored;
    private String stsIntrovert;
    private String fallTimes;
    private String machineWalk;
    private String tmse1;
    private String tmse2;
    private String tmse3;
    private String tmse4;
    private String tmse5;
    private String tmse6;
    private String tmse7;
    private String tmse8;
    private String tmse9;
    private String tmse10;
    private String tmse11;
    private String tmse12;
    private String tmse13;
    private String tmse14;
    private String tmse15;
    private String tmse16;
    private String tmse17;
    private String painNeck;
    private String painShoulder;
    private String painScapula;
    private String painElbow;
    private String painHand;
    private String painBack;
    private String painHip;
    private String painKnee;
    private String painFoot;
    private String healthNeck;
    private String healthBack;
    private String healthMuscle;
    private String healthMove;
    private String healthSit;
    private String healthStand;
    private String healthBow;
    private String healthSquatting;
    private String healthKneel;
    private String healthHeavy;
    private String healthLifting;
    private String healthCatch;
    private String healthThink;
    private String healthHearing;
    private String healthHand;
    private String healthSkin;
    private String workSkill;
    private String workBody;
    private String workThink;
    private String workEffect;
    private String workLeave;
    private String work2yrs;
    private String feelFun;
    private String feelActive;
    private String feelHope;
    private String disease;
    private String diseaseDetail;
    private String diseaseOth;
    private String tradeWash;
    private String careerNeed;
    private String careerNeedOth;
    private String careerNeedReason;
    private String tradeSlices;
    private String tradeFried;
    private String tradeOpen;
    private String tradeReach;
    private String tradeRaise;
    private String tradeCarry;
    private String tradeDrive;
    private String tradeMotorcise;
    private String tradeSit;
    private String tradeHeavy;
    private String tradeWall;
    private String tradeCal;
    private String tradeMobile;
    private String tradeApp;
    private String farmPrepare;
    private String farmHand;
    private String farmMachine;
    private String farmKnife;
    private String farmBack;
    private String farmWater;
    private String farmProan;
    private String farmWan;
    private String farmInjection;
    private String farmKeep;
    private String farmTool;
    private String farmPack;
    private String farmDrive;
    private String farmMotorcise;
    private String farmCal;
    private String farmMobile;
    private String farm6hrm;
    private String rubberKnife;
    private String rubberWalk;
    private String rubberDrive;
    private String rubberMotor;
    private String rubberSquat;
    private String rubberBow;
    private String rubberStand;
    private String rubberHeight;
    private String rubberHand;
    private String rubberKeep;
    private String rubberSale;
    private String rubberCal;
    private String rubberMobile;
    private String rubber6hrm;
    private String orcardKnife;
    private String orcardMachine;
    private String orcardClimb;
    private String orcardWater;
    private String orcardKeep;
    private String orcardShoulder;
    private String orcardBasket;
    private String orcardSale;
    private String orcardDrive;
    private String orcardMotor;
    private String orcardCal;
    private String orcardMobile;
    private String orcard6hrm;
    private String ricePrepare;
    private String riceHand;
    private String riceMachine;
    private String riceWan;
    private String riceInjection;
    private String riceWater;
    private String riceDig;
    private String riceKeep;
    private String riceMotor;
    private String riceSale;
    private String riceDrive;
    private String riceMotorcise;
    private String riceMobile;
    private String rice6hrm;
    private String surveyBy;
    private String createDtm;
    private String createBy;
	public String getCodeId() {
		return codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public String getMappingCode() {
		return mappingCode;
	}
	public void setMappingCode(String mappingCode) {
		this.mappingCode = mappingCode;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}
	public String getSurveyDate() {
		return surveyDate;
	}
	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate;
	}
	public String getSurveyStartTime() {
		return surveyStartTime;
	}
	public void setSurveyStartTime(String surveyStartTime) {
		this.surveyStartTime = surveyStartTime;
	}
	public String getSurveyEndTime() {
		return surveyEndTime;
	}
	public void setSurveyEndTime(String surveyEndTime) {
		this.surveyEndTime = surveyEndTime;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWaistline() {
		return waistline;
	}
	public void setWaistline(String waistline) {
		this.waistline = waistline;
	}
	public String getMemberTotal() {
		return memberTotal;
	}
	public void setMemberTotal(String memberTotal) {
		this.memberTotal = memberTotal;
	}
	public String getMemberEarnMoney() {
		return memberEarnMoney;
	}
	public void setMemberEarnMoney(String memberEarnMoney) {
		this.memberEarnMoney = memberEarnMoney;
	}
	public String getMemberTakecare() {
		return memberTakecare;
	}
	public void setMemberTakecare(String memberTakecare) {
		this.memberTakecare = memberTakecare;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getMaritalStatusOth() {
		return maritalStatusOth;
	}
	public void setMaritalStatusOth(String maritalStatusOth) {
		this.maritalStatusOth = maritalStatusOth;
	}
	public String getMedical() {
		return medical;
	}
	public void setMedical(String medical) {
		this.medical = medical;
	}
	public String getMedicalOth() {
		return medicalOth;
	}
	public void setMedicalOth(String medicalOth) {
		this.medicalOth = medicalOth;
	}
	public String getResidential() {
		return residential;
	}
	public void setResidential(String residential) {
		this.residential = residential;
	}
	public String getHouseLive() {
		return houseLive;
	}
	public void setHouseLive(String houseLive) {
		this.houseLive = houseLive;
	}
	public String getHouseBelong() {
		return houseBelong;
	}
	public void setHouseBelong(String houseBelong) {
		this.houseBelong = houseBelong;
	}
	public String getHouseBelongOth() {
		return houseBelongOth;
	}
	public void setHouseBelongOth(String houseBelongOth) {
		this.houseBelongOth = houseBelongOth;
	}
	public String getBedroom() {
		return bedroom;
	}
	public void setBedroom(String bedroom) {
		this.bedroom = bedroom;
	}
	public String getRestroom() {
		return restroom;
	}
	public void setRestroom(String restroom) {
		this.restroom = restroom;
	}
	public String getUseSmartphone() {
		return useSmartphone;
	}
	public void setUseSmartphone(String useSmartphone) {
		this.useSmartphone = useSmartphone;
	}
	public String getHelpOrg() {
		return helpOrg;
	}
	public void setHelpOrg(String helpOrg) {
		this.helpOrg = helpOrg;
	}
	public String getHelpSkill() {
		return helpSkill;
	}
	public void setHelpSkill(String helpSkill) {
		this.helpSkill = helpSkill;
	}
	public String getHelpMedical() {
		return helpMedical;
	}
	public void setHelpMedical(String helpMedical) {
		this.helpMedical = helpMedical;
	}
	public String getHelpOrgOth() {
		return helpOrgOth;
	}
	public void setHelpOrgOth(String helpOrgOth) {
		this.helpOrgOth = helpOrgOth;
	}
	public String getIncomeTotal() {
		return incomeTotal;
	}
	public void setIncomeTotal(String incomeTotal) {
		this.incomeTotal = incomeTotal;
	}
	public String getIncomeSource() {
		return incomeSource;
	}
	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}
	public String getIncomeOth() {
		return incomeOth;
	}
	public void setIncomeOth(String incomeOth) {
		this.incomeOth = incomeOth;
	}
	public String getExpendAvg() {
		return expendAvg;
	}
	public void setExpendAvg(String expendAvg) {
		this.expendAvg = expendAvg;
	}
	public String getExpendHealthYear() {
		return expendHealthYear;
	}
	public void setExpendHealthYear(String expendHealthYear) {
		this.expendHealthYear = expendHealthYear;
	}
	public String getIncomeEnough() {
		return incomeEnough;
	}
	public void setIncomeEnough(String incomeEnough) {
		this.incomeEnough = incomeEnough;
	}
	public String getCareerFlag() {
		return careerFlag;
	}
	public void setCareerFlag(String careerFlag) {
		this.careerFlag = careerFlag;
	}
	public String getCareerCurrent() {
		return careerCurrent;
	}
	public void setCareerCurrent(String careerCurrent) {
		this.careerCurrent = careerCurrent;
	}
	public String getCareerCurrentOth() {
		return careerCurrentOth;
	}
	public void setCareerCurrentOth(String careerCurrentOth) {
		this.careerCurrentOth = careerCurrentOth;
	}
	public String getIncomeMainTotal() {
		return incomeMainTotal;
	}
	public void setIncomeMainTotal(String incomeMainTotal) {
		this.incomeMainTotal = incomeMainTotal;
	}
	public String getIncomeAmt() {
		return incomeAmt;
	}
	public void setIncomeAmt(String incomeAmt) {
		this.incomeAmt = incomeAmt;
	}
	public String getIncomeDetail() {
		return incomeDetail;
	}
	public void setIncomeDetail(String incomeDetail) {
		this.incomeDetail = incomeDetail;
	}
	public String getIncomeDetailOth() {
		return incomeDetailOth;
	}
	public void setIncomeDetailOth(String incomeDetailOth) {
		this.incomeDetailOth = incomeDetailOth;
	}
	public String getWorkWeekHr() {
		return workWeekHr;
	}
	public void setWorkWeekHr(String workWeekHr) {
		this.workWeekHr = workWeekHr;
	}
	public String getDistantKm() {
		return distantKm;
	}
	public void setDistantKm(String distantKm) {
		this.distantKm = distantKm;
	}
	public String getDistantM() {
		return distantM;
	}
	public void setDistantM(String distantM) {
		this.distantM = distantM;
	}
	public String getDurationHr() {
		return durationHr;
	}
	public void setDurationHr(String durationHr) {
		this.durationHr = durationHr;
	}
	public String getDurationMin() {
		return durationMin;
	}
	public void setDurationMin(String durationMin) {
		this.durationMin = durationMin;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public String getWorkTravelType() {
		return workTravelType;
	}
	public void setWorkTravelType(String workTravelType) {
		this.workTravelType = workTravelType;
	}
	public String getWorkTravelOth() {
		return workTravelOth;
	}
	public void setWorkTravelOth(String workTravelOth) {
		this.workTravelOth = workTravelOth;
	}
	public String getAccident() {
		return accident;
	}
	public void setAccident(String accident) {
		this.accident = accident;
	}
	public String getAccidentDetail() {
		return accidentDetail;
	}
	public void setAccidentDetail(String accidentDetail) {
		this.accidentDetail = accidentDetail;
	}
	public String getNeedJob() {
		return needJob;
	}
	public void setNeedJob(String needJob) {
		this.needJob = needJob;
	}
	public String getNeedJobHr() {
		return needJobHr;
	}
	public void setNeedJobHr(String needJobHr) {
		this.needJobHr = needJobHr;
	}
	public String getWagesFlag() {
		return wagesFlag;
	}
	public void setWagesFlag(String wagesFlag) {
		this.wagesFlag = wagesFlag;
	}
	public String getWagesExpect() {
		return wagesExpect;
	}
	public void setWagesExpect(String wagesExpect) {
		this.wagesExpect = wagesExpect;
	}
	public String getJobExpect() {
		return jobExpect;
	}
	public void setJobExpect(String jobExpect) {
		this.jobExpect = jobExpect;
	}
	public String getNoNeedJobReason() {
		return noNeedJobReason;
	}
	public void setNoNeedJobReason(String noNeedJobReason) {
		this.noNeedJobReason = noNeedJobReason;
	}
	public String getNoNeedJobOth() {
		return noNeedJobOth;
	}
	public void setNoNeedJobOth(String noNeedJobOth) {
		this.noNeedJobOth = noNeedJobOth;
	}
	public String getWorkFor() {
		return workFor;
	}
	public void setWorkFor(String workFor) {
		this.workFor = workFor;
	}
	public String getWorkForOth() {
		return workForOth;
	}
	public void setWorkForOth(String workForOth) {
		this.workForOth = workForOth;
	}
	public String getExpectCareerGroup() {
		return expectCareerGroup;
	}
	public void setExpectCareerGroup(String expectCareerGroup) {
		this.expectCareerGroup = expectCareerGroup;
	}
	public String getExpectCareerOth() {
		return expectCareerOth;
	}
	public void setExpectCareerOth(String expectCareerOth) {
		this.expectCareerOth = expectCareerOth;
	}
	public String getExpectJobHr() {
		return expectJobHr;
	}
	public void setExpectJobHr(String expectJobHr) {
		this.expectJobHr = expectJobHr;
	}
	public String getExpectWagesHrType() {
		return expectWagesHrType;
	}
	public void setExpectWagesHrType(String expectWagesHrType) {
		this.expectWagesHrType = expectWagesHrType;
	}
	public String getExpectWagesHr() {
		return expectWagesHr;
	}
	public void setExpectWagesHr(String expectWagesHr) {
		this.expectWagesHr = expectWagesHr;
	}
	public String getSpecWork() {
		return specWork;
	}
	public void setSpecWork(String specWork) {
		this.specWork = specWork;
	}
	public String getCanWork() {
		return canWork;
	}
	public void setCanWork(String canWork) {
		this.canWork = canWork;
	}
	public String getCanWorkOth() {
		return canWorkOth;
	}
	public void setCanWorkOth(String canWorkOth) {
		this.canWorkOth = canWorkOth;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getCanTravelSelf() {
		return canTravelSelf;
	}
	public void setCanTravelSelf(String canTravelSelf) {
		this.canTravelSelf = canTravelSelf;
	}
	public String getCanTravelSelfOth() {
		return canTravelSelfOth;
	}
	public void setCanTravelSelfOth(String canTravelSelfOth) {
		this.canTravelSelfOth = canTravelSelfOth;
	}
	public String getWorkDaytime() {
		return workDaytime;
	}
	public void setWorkDaytime(String workDaytime) {
		this.workDaytime = workDaytime;
	}
	public String getWorkNight() {
		return workNight;
	}
	public void setWorkNight(String workNight) {
		this.workNight = workNight;
	}
	public String getCanRun() {
		return canRun;
	}
	public void setCanRun(String canRun) {
		this.canRun = canRun;
	}
	public String getCanArm() {
		return canArm;
	}
	public void setCanArm(String canArm) {
		this.canArm = canArm;
	}
	public String getCanShrink() {
		return canShrink;
	}
	public void setCanShrink(String canShrink) {
		this.canShrink = canShrink;
	}
	public String getCanSee() {
		return canSee;
	}
	public void setCanSee(String canSee) {
		this.canSee = canSee;
	}
	public String getSkillSpecial() {
		return skillSpecial;
	}
	public void setSkillSpecial(String skillSpecial) {
		this.skillSpecial = skillSpecial;
	}
	public String getSkillSpecialOth() {
		return skillSpecialOth;
	}
	public void setSkillSpecialOth(String skillSpecialOth) {
		this.skillSpecialOth = skillSpecialOth;
	}
	public String getSkillSpecialDetail() {
		return skillSpecialDetail;
	}
	public void setSkillSpecialDetail(String skillSpecialDetail) {
		this.skillSpecialDetail = skillSpecialDetail;
	}
	public String getStsSleep() {
		return stsSleep;
	}
	public void setStsSleep(String stsSleep) {
		this.stsSleep = stsSleep;
	}
	public String getStsConcentration() {
		return stsConcentration;
	}
	public void setStsConcentration(String stsConcentration) {
		this.stsConcentration = stsConcentration;
	}
	public String getStsEDGY() {
		return stsEDGY;
	}
	public void setStsEDGY(String stsEDGY) {
		this.stsEDGY = stsEDGY;
	}
	public String getStsBored() {
		return stsBored;
	}
	public void setStsBored(String stsBored) {
		this.stsBored = stsBored;
	}
	public String getStsIntrovert() {
		return stsIntrovert;
	}
	public void setStsIntrovert(String stsIntrovert) {
		this.stsIntrovert = stsIntrovert;
	}
	public String getFallTimes() {
		return fallTimes;
	}
	public void setFallTimes(String fallTimes) {
		this.fallTimes = fallTimes;
	}
	public String getMachineWalk() {
		return machineWalk;
	}
	public void setMachineWalk(String machineWalk) {
		this.machineWalk = machineWalk;
	}
	public String getTmse1() {
		return tmse1;
	}
	public void setTmse1(String tmse1) {
		this.tmse1 = tmse1;
	}
	public String getTmse2() {
		return tmse2;
	}
	public void setTmse2(String tmse2) {
		this.tmse2 = tmse2;
	}
	public String getTmse3() {
		return tmse3;
	}
	public void setTmse3(String tmse3) {
		this.tmse3 = tmse3;
	}
	public String getTmse4() {
		return tmse4;
	}
	public void setTmse4(String tmse4) {
		this.tmse4 = tmse4;
	}
	public String getTmse5() {
		return tmse5;
	}
	public void setTmse5(String tmse5) {
		this.tmse5 = tmse5;
	}
	public String getTmse6() {
		return tmse6;
	}
	public void setTmse6(String tmse6) {
		this.tmse6 = tmse6;
	}
	public String getTmse7() {
		return tmse7;
	}
	public void setTmse7(String tmse7) {
		this.tmse7 = tmse7;
	}
	public String getTmse8() {
		return tmse8;
	}
	public void setTmse8(String tmse8) {
		this.tmse8 = tmse8;
	}
	public String getTmse9() {
		return tmse9;
	}
	public void setTmse9(String tmse9) {
		this.tmse9 = tmse9;
	}
	public String getTmse10() {
		return tmse10;
	}
	public void setTmse10(String tmse10) {
		this.tmse10 = tmse10;
	}
	public String getTmse11() {
		return tmse11;
	}
	public void setTmse11(String tmse11) {
		this.tmse11 = tmse11;
	}
	public String getTmse12() {
		return tmse12;
	}
	public void setTmse12(String tmse12) {
		this.tmse12 = tmse12;
	}
	public String getTmse13() {
		return tmse13;
	}
	public void setTmse13(String tmse13) {
		this.tmse13 = tmse13;
	}
	public String getTmse14() {
		return tmse14;
	}
	public void setTmse14(String tmse14) {
		this.tmse14 = tmse14;
	}
	public String getTmse15() {
		return tmse15;
	}
	public void setTmse15(String tmse15) {
		this.tmse15 = tmse15;
	}
	public String getTmse16() {
		return tmse16;
	}
	public void setTmse16(String tmse16) {
		this.tmse16 = tmse16;
	}
	public String getTmse17() {
		return tmse17;
	}
	public void setTmse17(String tmse17) {
		this.tmse17 = tmse17;
	}
	public String getPainNeck() {
		return painNeck;
	}
	public void setPainNeck(String painNeck) {
		this.painNeck = painNeck;
	}
	public String getPainShoulder() {
		return painShoulder;
	}
	public void setPainShoulder(String painShoulder) {
		this.painShoulder = painShoulder;
	}
	public String getPainScapula() {
		return painScapula;
	}
	public void setPainScapula(String painScapula) {
		this.painScapula = painScapula;
	}
	public String getPainElbow() {
		return painElbow;
	}
	public void setPainElbow(String painElbow) {
		this.painElbow = painElbow;
	}
	public String getPainHand() {
		return painHand;
	}
	public void setPainHand(String painHand) {
		this.painHand = painHand;
	}
	public String getPainBack() {
		return painBack;
	}
	public void setPainBack(String painBack) {
		this.painBack = painBack;
	}
	public String getPainHip() {
		return painHip;
	}
	public void setPainHip(String painHip) {
		this.painHip = painHip;
	}
	public String getPainKnee() {
		return painKnee;
	}
	public void setPainKnee(String painKnee) {
		this.painKnee = painKnee;
	}
	public String getPainFoot() {
		return painFoot;
	}
	public void setPainFoot(String painFoot) {
		this.painFoot = painFoot;
	}
	public String getHealthNeck() {
		return healthNeck;
	}
	public void setHealthNeck(String healthNeck) {
		this.healthNeck = healthNeck;
	}
	public String getHealthBack() {
		return healthBack;
	}
	public void setHealthBack(String healthBack) {
		this.healthBack = healthBack;
	}
	public String getHealthMuscle() {
		return healthMuscle;
	}
	public void setHealthMuscle(String healthMuscle) {
		this.healthMuscle = healthMuscle;
	}
	public String getHealthMove() {
		return healthMove;
	}
	public void setHealthMove(String healthMove) {
		this.healthMove = healthMove;
	}
	public String getHealthSit() {
		return healthSit;
	}
	public void setHealthSit(String healthSit) {
		this.healthSit = healthSit;
	}
	public String getHealthStand() {
		return healthStand;
	}
	public void setHealthStand(String healthStand) {
		this.healthStand = healthStand;
	}
	public String getHealthBow() {
		return healthBow;
	}
	public void setHealthBow(String healthBow) {
		this.healthBow = healthBow;
	}
	public String getHealthSquatting() {
		return healthSquatting;
	}
	public void setHealthSquatting(String healthSquatting) {
		this.healthSquatting = healthSquatting;
	}
	public String getHealthKneel() {
		return healthKneel;
	}
	public void setHealthKneel(String healthKneel) {
		this.healthKneel = healthKneel;
	}
	public String getHealthHeavy() {
		return healthHeavy;
	}
	public void setHealthHeavy(String healthHeavy) {
		this.healthHeavy = healthHeavy;
	}
	public String getHealthLifting() {
		return healthLifting;
	}
	public void setHealthLifting(String healthLifting) {
		this.healthLifting = healthLifting;
	}
	public String getHealthCatch() {
		return healthCatch;
	}
	public void setHealthCatch(String healthCatch) {
		this.healthCatch = healthCatch;
	}
	public String getHealthThink() {
		return healthThink;
	}
	public void setHealthThink(String healthThink) {
		this.healthThink = healthThink;
	}
	public String getHealthHearing() {
		return healthHearing;
	}
	public void setHealthHearing(String healthHearing) {
		this.healthHearing = healthHearing;
	}
	public String getHealthHand() {
		return healthHand;
	}
	public void setHealthHand(String healthHand) {
		this.healthHand = healthHand;
	}
	public String getHealthSkin() {
		return healthSkin;
	}
	public void setHealthSkin(String healthSkin) {
		this.healthSkin = healthSkin;
	}
	public String getWorkSkill() {
		return workSkill;
	}
	public void setWorkSkill(String workSkill) {
		this.workSkill = workSkill;
	}
	public String getWorkBody() {
		return workBody;
	}
	public void setWorkBody(String workBody) {
		this.workBody = workBody;
	}
	public String getWorkThink() {
		return workThink;
	}
	public void setWorkThink(String workThink) {
		this.workThink = workThink;
	}
	public String getWorkEffect() {
		return workEffect;
	}
	public void setWorkEffect(String workEffect) {
		this.workEffect = workEffect;
	}
	public String getWorkLeave() {
		return workLeave;
	}
	public void setWorkLeave(String workLeave) {
		this.workLeave = workLeave;
	}
	public String getWork2yrs() {
		return work2yrs;
	}
	public void setWork2yrs(String work2yrs) {
		this.work2yrs = work2yrs;
	}
	public String getFeelFun() {
		return feelFun;
	}
	public void setFeelFun(String feelFun) {
		this.feelFun = feelFun;
	}
	public String getFeelActive() {
		return feelActive;
	}
	public void setFeelActive(String feelActive) {
		this.feelActive = feelActive;
	}
	public String getFeelHope() {
		return feelHope;
	}
	public void setFeelHope(String feelHope) {
		this.feelHope = feelHope;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDiseaseDetail() {
		return diseaseDetail;
	}
	public void setDiseaseDetail(String diseaseDetail) {
		this.diseaseDetail = diseaseDetail;
	}
	public String getDiseaseOth() {
		return diseaseOth;
	}
	public void setDiseaseOth(String diseaseOth) {
		this.diseaseOth = diseaseOth;
	}
	public String getTradeWash() {
		return tradeWash;
	}
	public void setTradeWash(String tradeWash) {
		this.tradeWash = tradeWash;
	}
	public String getCareerNeed() {
		return careerNeed;
	}
	public void setCareerNeed(String careerNeed) {
		this.careerNeed = careerNeed;
	}
	public String getCareerNeedOth() {
		return careerNeedOth;
	}
	public void setCareerNeedOth(String careerNeedOth) {
		this.careerNeedOth = careerNeedOth;
	}
	public String getCareerNeedReason() {
		return careerNeedReason;
	}
	public void setCareerNeedReason(String careerNeedReason) {
		this.careerNeedReason = careerNeedReason;
	}
	public String getTradeSlices() {
		return tradeSlices;
	}
	public void setTradeSlices(String tradeSlices) {
		this.tradeSlices = tradeSlices;
	}
	public String getTradeFried() {
		return tradeFried;
	}
	public void setTradeFried(String tradeFried) {
		this.tradeFried = tradeFried;
	}
	public String getTradeOpen() {
		return tradeOpen;
	}
	public void setTradeOpen(String tradeOpen) {
		this.tradeOpen = tradeOpen;
	}
	public String getTradeReach() {
		return tradeReach;
	}
	public void setTradeReach(String tradeReach) {
		this.tradeReach = tradeReach;
	}
	public String getTradeRaise() {
		return tradeRaise;
	}
	public void setTradeRaise(String tradeRaise) {
		this.tradeRaise = tradeRaise;
	}
	public String getTradeCarry() {
		return tradeCarry;
	}
	public void setTradeCarry(String tradeCarry) {
		this.tradeCarry = tradeCarry;
	}
	public String getTradeDrive() {
		return tradeDrive;
	}
	public void setTradeDrive(String tradeDrive) {
		this.tradeDrive = tradeDrive;
	}
	public String getTradeMotorcise() {
		return tradeMotorcise;
	}
	public void setTradeMotorcise(String tradeMotorcise) {
		this.tradeMotorcise = tradeMotorcise;
	}
	public String getTradeSit() {
		return tradeSit;
	}
	public void setTradeSit(String tradeSit) {
		this.tradeSit = tradeSit;
	}
	public String getTradeHeavy() {
		return tradeHeavy;
	}
	public void setTradeHeavy(String tradeHeavy) {
		this.tradeHeavy = tradeHeavy;
	}
	public String getTradeWall() {
		return tradeWall;
	}
	public void setTradeWall(String tradeWall) {
		this.tradeWall = tradeWall;
	}
	public String getTradeCal() {
		return tradeCal;
	}
	public void setTradeCal(String tradeCal) {
		this.tradeCal = tradeCal;
	}
	public String getTradeMobile() {
		return tradeMobile;
	}
	public void setTradeMobile(String tradeMobile) {
		this.tradeMobile = tradeMobile;
	}
	public String getTradeApp() {
		return tradeApp;
	}
	public void setTradeApp(String tradeApp) {
		this.tradeApp = tradeApp;
	}
	public String getFarmPrepare() {
		return farmPrepare;
	}
	public void setFarmPrepare(String farmPrepare) {
		this.farmPrepare = farmPrepare;
	}
	public String getFarmHand() {
		return farmHand;
	}
	public void setFarmHand(String farmHand) {
		this.farmHand = farmHand;
	}
	public String getFarmMachine() {
		return farmMachine;
	}
	public void setFarmMachine(String farmMachine) {
		this.farmMachine = farmMachine;
	}
	public String getFarmKnife() {
		return farmKnife;
	}
	public void setFarmKnife(String farmKnife) {
		this.farmKnife = farmKnife;
	}
	public String getFarmBack() {
		return farmBack;
	}
	public void setFarmBack(String farmBack) {
		this.farmBack = farmBack;
	}
	public String getFarmWater() {
		return farmWater;
	}
	public void setFarmWater(String farmWater) {
		this.farmWater = farmWater;
	}
	public String getFarmProan() {
		return farmProan;
	}
	public void setFarmProan(String farmProan) {
		this.farmProan = farmProan;
	}
	public String getFarmWan() {
		return farmWan;
	}
	public void setFarmWan(String farmWan) {
		this.farmWan = farmWan;
	}
	public String getFarmInjection() {
		return farmInjection;
	}
	public void setFarmInjection(String farmInjection) {
		this.farmInjection = farmInjection;
	}
	public String getFarmKeep() {
		return farmKeep;
	}
	public void setFarmKeep(String farmKeep) {
		this.farmKeep = farmKeep;
	}
	public String getFarmTool() {
		return farmTool;
	}
	public void setFarmTool(String farmTool) {
		this.farmTool = farmTool;
	}
	public String getFarmPack() {
		return farmPack;
	}
	public void setFarmPack(String farmPack) {
		this.farmPack = farmPack;
	}
	public String getFarmDrive() {
		return farmDrive;
	}
	public void setFarmDrive(String farmDrive) {
		this.farmDrive = farmDrive;
	}
	public String getFarmMotorcise() {
		return farmMotorcise;
	}
	public void setFarmMotorcise(String farmMotorcise) {
		this.farmMotorcise = farmMotorcise;
	}
	public String getFarmCal() {
		return farmCal;
	}
	public void setFarmCal(String farmCal) {
		this.farmCal = farmCal;
	}
	public String getFarmMobile() {
		return farmMobile;
	}
	public void setFarmMobile(String farmMobile) {
		this.farmMobile = farmMobile;
	}
	public String getFarm6hrm() {
		return farm6hrm;
	}
	public void setFarm6hrm(String farm6hrm) {
		this.farm6hrm = farm6hrm;
	}
	public String getRubberKnife() {
		return rubberKnife;
	}
	public void setRubberKnife(String rubberKnife) {
		this.rubberKnife = rubberKnife;
	}
	public String getRubberWalk() {
		return rubberWalk;
	}
	public void setRubberWalk(String rubberWalk) {
		this.rubberWalk = rubberWalk;
	}
	public String getRubberDrive() {
		return rubberDrive;
	}
	public void setRubberDrive(String rubberDrive) {
		this.rubberDrive = rubberDrive;
	}
	public String getRubberMotor() {
		return rubberMotor;
	}
	public void setRubberMotor(String rubberMotor) {
		this.rubberMotor = rubberMotor;
	}
	public String getRubberSquat() {
		return rubberSquat;
	}
	public void setRubberSquat(String rubberSquat) {
		this.rubberSquat = rubberSquat;
	}
	public String getRubberBow() {
		return rubberBow;
	}
	public void setRubberBow(String rubberBow) {
		this.rubberBow = rubberBow;
	}
	public String getRubberStand() {
		return rubberStand;
	}
	public void setRubberStand(String rubberStand) {
		this.rubberStand = rubberStand;
	}
	public String getRubberHeight() {
		return rubberHeight;
	}
	public void setRubberHeight(String rubberHeight) {
		this.rubberHeight = rubberHeight;
	}
	public String getRubberHand() {
		return rubberHand;
	}
	public void setRubberHand(String rubberHand) {
		this.rubberHand = rubberHand;
	}
	public String getRubberKeep() {
		return rubberKeep;
	}
	public void setRubberKeep(String rubberKeep) {
		this.rubberKeep = rubberKeep;
	}
	public String getRubberSale() {
		return rubberSale;
	}
	public void setRubberSale(String rubberSale) {
		this.rubberSale = rubberSale;
	}
	public String getRubberCal() {
		return rubberCal;
	}
	public void setRubberCal(String rubberCal) {
		this.rubberCal = rubberCal;
	}
	public String getRubberMobile() {
		return rubberMobile;
	}
	public void setRubberMobile(String rubberMobile) {
		this.rubberMobile = rubberMobile;
	}
	public String getRubber6hrm() {
		return rubber6hrm;
	}
	public void setRubber6hrm(String rubber6hrm) {
		this.rubber6hrm = rubber6hrm;
	}
	public String getOrcardKnife() {
		return orcardKnife;
	}
	public void setOrcardKnife(String orcardKnife) {
		this.orcardKnife = orcardKnife;
	}
	public String getOrcardMachine() {
		return orcardMachine;
	}
	public void setOrcardMachine(String orcardMachine) {
		this.orcardMachine = orcardMachine;
	}
	public String getOrcardClimb() {
		return orcardClimb;
	}
	public void setOrcardClimb(String orcardClimb) {
		this.orcardClimb = orcardClimb;
	}
	public String getOrcardWater() {
		return orcardWater;
	}
	public void setOrcardWater(String orcardWater) {
		this.orcardWater = orcardWater;
	}
	public String getOrcardKeep() {
		return orcardKeep;
	}
	public void setOrcardKeep(String orcardKeep) {
		this.orcardKeep = orcardKeep;
	}
	public String getOrcardShoulder() {
		return orcardShoulder;
	}
	public void setOrcardShoulder(String orcardShoulder) {
		this.orcardShoulder = orcardShoulder;
	}
	public String getOrcardBasket() {
		return orcardBasket;
	}
	public void setOrcardBasket(String orcardBasket) {
		this.orcardBasket = orcardBasket;
	}
	public String getOrcardSale() {
		return orcardSale;
	}
	public void setOrcardSale(String orcardSale) {
		this.orcardSale = orcardSale;
	}
	public String getOrcardDrive() {
		return orcardDrive;
	}
	public void setOrcardDrive(String orcardDrive) {
		this.orcardDrive = orcardDrive;
	}
	public String getOrcardMotor() {
		return orcardMotor;
	}
	public void setOrcardMotor(String orcardMotor) {
		this.orcardMotor = orcardMotor;
	}
	public String getOrcardCal() {
		return orcardCal;
	}
	public void setOrcardCal(String orcardCal) {
		this.orcardCal = orcardCal;
	}
	public String getOrcardMobile() {
		return orcardMobile;
	}
	public void setOrcardMobile(String orcardMobile) {
		this.orcardMobile = orcardMobile;
	}
	public String getOrcard6hrm() {
		return orcard6hrm;
	}
	public void setOrcard6hrm(String orcard6hrm) {
		this.orcard6hrm = orcard6hrm;
	}
	public String getRicePrepare() {
		return ricePrepare;
	}
	public void setRicePrepare(String ricePrepare) {
		this.ricePrepare = ricePrepare;
	}
	public String getRiceHand() {
		return riceHand;
	}
	public void setRiceHand(String riceHand) {
		this.riceHand = riceHand;
	}
	public String getRiceMachine() {
		return riceMachine;
	}
	public void setRiceMachine(String riceMachine) {
		this.riceMachine = riceMachine;
	}
	public String getRiceWan() {
		return riceWan;
	}
	public void setRiceWan(String riceWan) {
		this.riceWan = riceWan;
	}
	public String getRiceInjection() {
		return riceInjection;
	}
	public void setRiceInjection(String riceInjection) {
		this.riceInjection = riceInjection;
	}
	public String getRiceWater() {
		return riceWater;
	}
	public void setRiceWater(String riceWater) {
		this.riceWater = riceWater;
	}
	public String getRiceDig() {
		return riceDig;
	}
	public void setRiceDig(String riceDig) {
		this.riceDig = riceDig;
	}
	public String getRiceKeep() {
		return riceKeep;
	}
	public void setRiceKeep(String riceKeep) {
		this.riceKeep = riceKeep;
	}
	public String getRiceMotor() {
		return riceMotor;
	}
	public void setRiceMotor(String riceMotor) {
		this.riceMotor = riceMotor;
	}
	public String getRiceSale() {
		return riceSale;
	}
	public void setRiceSale(String riceSale) {
		this.riceSale = riceSale;
	}
	public String getRiceDrive() {
		return riceDrive;
	}
	public void setRiceDrive(String riceDrive) {
		this.riceDrive = riceDrive;
	}
	public String getRiceMotorcise() {
		return riceMotorcise;
	}
	public void setRiceMotorcise(String riceMotorcise) {
		this.riceMotorcise = riceMotorcise;
	}
	public String getRiceMobile() {
		return riceMobile;
	}
	public void setRiceMobile(String riceMobile) {
		this.riceMobile = riceMobile;
	}
	public String getRice6hrm() {
		return rice6hrm;
	}
	public void setRice6hrm(String rice6hrm) {
		this.rice6hrm = rice6hrm;
	}
	public String getSurveyBy() {
		return surveyBy;
	}
	public void setSurveyBy(String surveyBy) {
		this.surveyBy = surveyBy;
	}
	public String getCreateDtm() {
		return createDtm;
	}
	public void setCreateDtm(String createDtm) {
		this.createDtm = createDtm;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}
