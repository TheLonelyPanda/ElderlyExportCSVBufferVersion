package th.co.eecsv.service;

import java.io.BufferedWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import th.co.eecsv.entity.MasterElderlyPerson;


public class DbService {
	
	Connection conn=null;
	
	public DbService(Connection conn) {
		this.conn = conn;
	}
	
	public ArrayList<MasterElderlyPerson> getElderlyPerson() {
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<MasterElderlyPerson> resultList = new ArrayList<MasterElderlyPerson>();
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM m_elderly_person where area_id between 1 and 4 and survey_by is not null order by mapping_code");
			//sql.append("SELECT * FROM m_elderly_person where survey_by is not null order by code_id");
			pst = conn.prepareStatement(sql.toString());
			rs = pst.executeQuery();
			while (rs.next()) {
				MasterElderlyPerson cp = new MasterElderlyPerson();
				cp.setCodeId(replaceC(checkNullAndReplace(rs.getString("code_id"))));
				cp.setMappingCode(replaceC(checkNullAndReplace(rs.getString("mapping_code"))));
				cp.setAreaId(replaceC(checkNullAndReplace(rs.getString("area_id"))));
				cp.setSurveyName(replaceC(checkNullAndReplace(rs.getString("survey_name"))));
				cp.setSurveyDate(replaceC(checkNullAndReplace(rs.getString("survey_date"))));
				cp.setSurveyStartTime(replaceC(checkNullAndReplace(rs.getString("survey_start_time"))));
				cp.setSurveyEndTime(replaceC(checkNullAndReplace(rs.getString("survey_end_time"))));
				cp.setGender(replaceGender(replaceC(checkNullAndReplace(rs.getString("gender")))));
				cp.setBirthday(replaceC(checkNullAndReplace(rs.getString("birthday"))));
				cp.setWeight(replaceC(checkNullAndReplace(rs.getString("weight"))));
				cp.setHeight(replaceC(checkNullAndReplace(rs.getString("height"))));
				cp.setWaistline(replaceC(checkNullAndReplace(rs.getString("waistline"))));
				cp.setMemberTotal(replaceC(checkNullAndReplace(rs.getString("member_total"))));
				cp.setMemberEarnMoney(replaceC(checkNullAndReplace(rs.getString("member_earn_money"))));
				cp.setMemberTakecare(replaceC(checkNullAndReplace(rs.getString("member_takecare"))));
				cp.setEducation(replaceC(checkNullAndReplace(rs.getString("education"))));
				cp.setMaritalStatus(replaceC(checkNullAndReplace(rs.getString("marital_status"))));
				cp.setMaritalStatusOth(checkNullAndReplaceOth(rs.getString("marital_status_oth")));
				cp.setMedical(replaceC(checkNullAndReplace(rs.getString("medical"))));
				cp.setMedicalOth(checkNullAndReplaceOth(rs.getString("medical_oth")));
				cp.setResidential(replaceC(checkNullAndReplace(rs.getString("residential"))));
				cp.setHouseLive(replaceC(checkNullAndReplace(rs.getString("house_live"))));
				cp.setHouseBelong(replaceC(checkNullAndReplace(rs.getString("house_belong"))));
				cp.setHouseBelongOth(checkNullAndReplaceOth(rs.getString("house_belong_oth")));
				cp.setBedroom(replaceC(checkNullAndReplace(rs.getString("bedroom"))));
				cp.setRestroom(replaceC(checkNullAndReplace(rs.getString("restroom"))));
				cp.setUseSmartphone(replaceC(checkNullAndReplace(rs.getString("use_smartphone"))));
				cp.setHelpOrg(replaceC(checkNullAndReplace(rs.getString("help_org"))));
				cp.setHelpSkill(checkNullAndReplaceOth(rs.getString("help_skill")));
				cp.setHelpMedical(checkNullAndReplaceOth(rs.getString("help_medical")));
				cp.setHelpOrgOth(checkNullAndReplaceOth(rs.getString("help_org_oth")));
				cp.setIncomeTotal(replaceC(checkNullAndReplace(rs.getString("income_total"))));
				cp.setIncomeSource(replaceC(checkNullAndReplace(rs.getString("income_source"))));
				cp.setIncomeOth(checkNullAndReplaceOth(rs.getString("income_oth")));
				cp.setExpendAvg(replaceC(checkNullAndReplace(rs.getString("expend_avg"))));
				cp.setExpendHealthYear(replaceC(checkNullAndReplace(rs.getString("expend_health_year"))));
				cp.setIncomeEnough(replaceC(checkNullAndReplace(rs.getString("income_enough"))));
				cp.setCareerFlag(replaceC(checkNullAndReplace(rs.getString("career_flag"))));
				cp.setCareerCurrent(replaceC(checkNullAndReplace(rs.getString("career_current"))));
				cp.setCareerCurrentOth(checkNullAndReplaceOth(rs.getString("career_current_oth")));
				cp.setIncomeMainTotal(replaceC(checkNullAndReplace(rs.getString("income_main_total"))));
				cp.setIncomeAmt(replaceC(checkNullAndReplace(rs.getString("income_amt"))));
				cp.setIncomeDetail(replaceC(checkNullAndReplace(rs.getString("income_detail"))));
				cp.setIncomeDetailOth(checkNullAndReplaceOth(rs.getString("income_detail_oth")));
				cp.setWorkWeekHr(replaceC(checkNullAndReplace(rs.getString("work_week_hr"))));
				cp.setDistantKm(replaceC(checkNullAndReplace(rs.getString("distant_km"))));
				cp.setDistantM(replaceC(checkNullAndReplace(rs.getString("distant_m"))));
				cp.setDurationHr(replaceC(checkNullAndReplace(rs.getString("duration_hr"))));
				cp.setDurationMin(replaceC(checkNullAndReplace(rs.getString("duration_min"))));
				cp.setWorkPlace(replaceC(checkNullAndReplace(rs.getString("work_place"))));
				cp.setWorkTravelType(replaceC(checkNullAndReplace(rs.getString("work_travel_type"))));
				cp.setWorkTravelOth(checkNullAndReplaceOth(rs.getString("work_travel_oth")));
				cp.setAccident(replaceC(checkNullAndReplace(rs.getString("accident"))));
				cp.setAccidentDetail(checkNullAndReplaceOth(rs.getString("accident_detail")));
				cp.setNeedJob(replaceC(checkNullAndReplace(rs.getString("need_job"))));
				cp.setNeedJobHr(replaceC(checkNullAndReplace(rs.getString("need_job_hr"))));
				cp.setWagesFlag(replaceC(checkNullAndReplace(rs.getString("wages_flag"))));
				cp.setWagesExpect(replaceC(checkNullAndReplace(rs.getString("wages_expect"))));
				cp.setJobExpect(checkNullAndReplaceOth(rs.getString("job_expect")));
				cp.setNoNeedJobReason(replaceC(checkNullAndReplace(rs.getString("no_need_job_reason"))));
				cp.setNoNeedJobOth(checkNullAndReplaceOth(rs.getString("no_need_job_oth")));
				cp.setWorkFor(replaceC(checkNullAndReplace(rs.getString("work_for"))));
				cp.setWorkForOth(checkNullAndReplaceOth(rs.getString("work_for_oth")));
				cp.setExpectCareerGroup(replaceC(checkNullAndReplace(rs.getString("expect_career_group"))));
				cp.setExpectCareerOth(checkNullAndReplaceOth(rs.getString("expect_career_oth")));
				cp.setExpectJobHr(replaceC(checkNullAndReplace(rs.getString("expect_job_hr"))));
				cp.setExpectWagesHrType(replaceC(checkNullAndReplace(rs.getString("expect_wages_hr_type"))));
				cp.setExpectWagesHr(replaceC(checkNullAndReplace(rs.getString("expect_wages_hr"))));
				cp.setSpecWork(checkNullAndReplaceOth(rs.getString("spec_work")));
				cp.setCanWork(replaceC(checkNullAndReplace(rs.getString("can_work"))));
				cp.setCanWorkOth(checkNullAndReplaceOth(rs.getString("can_work_oth")));
				cp.setWorkLocation(replaceC(checkNullAndReplace(rs.getString("work_location"))));
				cp.setCanTravelSelf(replaceC(checkNullAndReplace(rs.getString("can_travel_self"))));
				cp.setCanTravelSelfOth(checkNullAndReplaceOth(rs.getString("can_travel_self_oth")));
				cp.setWorkDaytime(replaceC(checkNullAndReplace(rs.getString("work_daytime"))));
				cp.setWorkNight(replaceC(checkNullAndReplace(rs.getString("work_night"))));
				cp.setCanRun(replaceC(checkNullAndReplace(rs.getString("can_run"))));
				cp.setCanArm(replaceC(checkNullAndReplace(rs.getString("can_arm"))));
				cp.setCanShrink(replaceC(checkNullAndReplace(rs.getString("can_shrink"))));
				cp.setCanSee(replaceC(checkNullAndReplace(rs.getString("can_see"))));
				cp.setSkillSpecial(replaceC(checkNullAndReplace(rs.getString("skill_special"))));
				cp.setSkillSpecialOth(checkNullAndReplaceOth(rs.getString("skill_special_oth")));
				cp.setSkillSpecialDetail(checkNullAndReplaceOth(rs.getString("skill_special_detail")));
				cp.setStsSleep(replaceC(checkNullAndReplace(rs.getString("sts_sleep"))));
				cp.setStsConcentration(replaceC(checkNullAndReplace(rs.getString("sts_concentration"))));
				cp.setStsEDGY(replaceC(checkNullAndReplace(rs.getString("sts_edgy"))));
				cp.setStsBored(replaceC(checkNullAndReplace(rs.getString("sts_bored"))));
				cp.setStsIntrovert(replaceC(checkNullAndReplace(rs.getString("sts_introvert"))));
				cp.setFallTimes(replaceC(checkNullAndReplace(rs.getString("fall_times"))));
				cp.setMachineWalk(replaceC(checkNullAndReplace(rs.getString("machine_walk"))));
				cp.setTmse1(replaceC(checkNullAndReplace(rs.getString("tmse1"))));
				cp.setTmse2(replaceC(checkNullAndReplace(rs.getString("tmse2"))));
				cp.setTmse3(replaceC(checkNullAndReplace(rs.getString("tmse3"))));
				cp.setTmse4(replaceC(checkNullAndReplace(rs.getString("tmse4"))));
				cp.setTmse5(replaceC(checkNullAndReplace(rs.getString("tmse5"))));
				cp.setTmse6(replaceC(checkNullAndReplace(rs.getString("tmse6"))));
				cp.setTmse7(replaceC(checkNullAndReplace(rs.getString("tmse7"))));
				cp.setTmse8(replaceC(checkNullAndReplace(rs.getString("tmse8"))));
				cp.setTmse9(replaceC(checkNullAndReplace(rs.getString("tmse9"))));
				cp.setTmse10(replaceC(checkNullAndReplace(rs.getString("tmse10"))));
				cp.setTmse11(replaceC(checkNullAndReplace(rs.getString("tmse11"))));
				cp.setTmse12(replaceC(checkNullAndReplace(rs.getString("tmse12"))));
				cp.setTmse13(replaceC(checkNullAndReplace(rs.getString("tmse13"))));
				cp.setTmse14(replaceC(checkNullAndReplace(rs.getString("tmse14"))));
				cp.setTmse15(replaceC(checkNullAndReplace(rs.getString("tmse15"))));
				cp.setTmse16(replaceC(checkNullAndReplace(rs.getString("tmse16"))));
				cp.setTmse17(replaceC(checkNullAndReplace(rs.getString("tmse17"))));
				cp.setPainNeck(replaceC(checkNullAndReplace(rs.getString("pain_neck"))));
				cp.setPainShoulder(replaceC(checkNullAndReplace(rs.getString("pain_shoulder"))));
				cp.setPainScapula(replaceC(checkNullAndReplace(rs.getString("pain_scapula"))));
				cp.setPainElbow(replaceC(checkNullAndReplace(rs.getString("pain_elbow"))));
				cp.setPainHand(replaceC(checkNullAndReplace(rs.getString("pain_hand"))));
				cp.setPainBack(replaceC(checkNullAndReplace(rs.getString("pain_back"))));
				cp.setPainHip(replaceC(checkNullAndReplace(rs.getString("pain_hip"))));
				cp.setPainKnee(replaceC(checkNullAndReplace(rs.getString("pain_knee"))));
				cp.setPainFoot(replaceC(checkNullAndReplace(rs.getString("pain_foot"))));
				cp.setHealthNeck(replaceC(checkNullAndReplace(rs.getString("health_neck"))));
				cp.setHealthBack(replaceC(checkNullAndReplace(rs.getString("health_back"))));
				cp.setHealthMuscle(replaceC(checkNullAndReplace(rs.getString("health_muscle"))));
				cp.setHealthMove(replaceC(checkNullAndReplace(rs.getString("health_move"))));
				cp.setHealthSit(replaceC(checkNullAndReplace(rs.getString("health_sit"))));
				cp.setHealthStand(replaceC(checkNullAndReplace(rs.getString("health_stand"))));
				cp.setHealthBow(replaceC(checkNullAndReplace(rs.getString("health_bow"))));
				cp.setHealthSquatting(replaceC(checkNullAndReplace(rs.getString("health_squatting"))));
				cp.setHealthKneel(replaceC(checkNullAndReplace(rs.getString("health_kneel"))));
				cp.setHealthHeavy(replaceC(checkNullAndReplace(rs.getString("health_heavy"))));
				cp.setHealthLifting(replaceC(checkNullAndReplace(rs.getString("health_lifting"))));
				cp.setHealthCatch(replaceC(checkNullAndReplace(rs.getString("health_catch"))));
				cp.setHealthThink(replaceC(checkNullAndReplace(rs.getString("health_think"))));
				cp.setHealthHearing(replaceC(checkNullAndReplace(rs.getString("health_hearing"))));
				cp.setHealthHand(replaceC(checkNullAndReplace(rs.getString("health_hand"))));
				cp.setHealthSkin(replaceC(checkNullAndReplace(rs.getString("health_skin"))));
				cp.setWorkSkill(replaceC(checkNullAndReplace(rs.getString("work_skill"))));
				cp.setWorkBody(replaceC(checkNullAndReplace(rs.getString("work_body"))));
				cp.setWorkThink(replaceC(checkNullAndReplace(rs.getString("work_think"))));
				cp.setWorkEffect(replaceC(checkNullAndReplace(rs.getString("work_effect"))));
				cp.setWorkLeave(replaceC(checkNullAndReplace(rs.getString("work_leave"))));
				cp.setWork2yrs(replaceC(checkNullAndReplace(rs.getString("work_2yrs"))));
				cp.setFeelFun(replaceC(checkNullAndReplace(rs.getString("feel_fun"))));
				cp.setFeelActive(replaceC(checkNullAndReplace(rs.getString("feel_active"))));
				cp.setFeelHope(replaceC(checkNullAndReplace(rs.getString("feel_hope"))));
				cp.setDisease(replaceC(checkNullAndReplace(rs.getString("disease"))));
				cp.setDiseaseDetail(replaceC(checkNullAndReplace(rs.getString("disease_detail"))));
				cp.setDiseaseOth(checkNullAndReplaceOth(rs.getString("disease_oth")));
				cp.setCareerNeed(replaceC(checkNullAndReplace(rs.getString("career_need"))));
				cp.setCareerNeedOth(checkNullAndReplaceOth(rs.getString("career_need_oth")));
				cp.setCareerNeedReason(checkNullAndReplaceOth(rs.getString("career_need_reason")));
				cp.setTradeWash(replaceC(checkNullAndReplace(rs.getString("trade_wash"))));
				cp.setTradeSlices(replaceC(checkNullAndReplace(rs.getString("trade_slices"))));
				cp.setTradeFried(replaceC(checkNullAndReplace(rs.getString("trade_fried"))));
				cp.setTradeOpen(replaceC(checkNullAndReplace(rs.getString("trade_open"))));
				cp.setTradeReach(replaceC(checkNullAndReplace(rs.getString("trade_reach"))));
				cp.setTradeRaise(replaceC(checkNullAndReplace(rs.getString("trade_raise"))));
				cp.setTradeCarry(replaceC(checkNullAndReplace(rs.getString("trade_carry"))));
				cp.setTradeDrive(replaceC(checkNullAndReplace(rs.getString("trade_drive"))));
				cp.setTradeMotorcise(replaceC(checkNullAndReplace(rs.getString("trade_motorcise"))));
				cp.setTradeSit(replaceC(checkNullAndReplace(rs.getString("trade_sit"))));
				cp.setTradeHeavy(replaceC(checkNullAndReplace(rs.getString("trade_heavy"))));
				cp.setTradeWall(replaceC(checkNullAndReplace(rs.getString("trade_wall"))));
				cp.setTradeCal(replaceC(checkNullAndReplace(rs.getString("trade_cal"))));
				cp.setTradeMobile(replaceC(checkNullAndReplace(rs.getString("trade_mobile"))));
				cp.setTradeApp(replaceC(checkNullAndReplace(rs.getString("trade_app"))));
				cp.setFarmPrepare(replaceC(checkNullAndReplace(rs.getString("farm_prepare"))));
				cp.setFarmHand(replaceC(checkNullAndReplace(rs.getString("farm_hand"))));
				cp.setFarmMachine(replaceC(checkNullAndReplace(rs.getString("farm_machine"))));
				cp.setFarmKnife(replaceC(checkNullAndReplace(rs.getString("farm_knife"))));
				cp.setFarmBack(replaceC(checkNullAndReplace(rs.getString("farm_back"))));
				cp.setFarmWater(replaceC(checkNullAndReplace(rs.getString("farm_water"))));
				cp.setFarmProan(replaceC(checkNullAndReplace(rs.getString("farm_proan"))));
				cp.setFarmWan(replaceC(checkNullAndReplace(rs.getString("farm_wan"))));
				cp.setFarmInjection(replaceC(checkNullAndReplace(rs.getString("farm_injection"))));
				cp.setFarmKeep(replaceC(checkNullAndReplace(rs.getString("farm_keep"))));
				cp.setFarmTool(replaceC(checkNullAndReplace(rs.getString("farm_tool"))));
				cp.setFarmPack(replaceC(checkNullAndReplace(rs.getString("farm_pack"))));
				cp.setFarmDrive(replaceC(checkNullAndReplace(rs.getString("farm_drive"))));
				cp.setFarmMotorcise(replaceC(checkNullAndReplace(rs.getString("farm_motorcise"))));
				cp.setFarmCal(replaceC(checkNullAndReplace(rs.getString("farm_cal"))));
				cp.setFarmMobile(replaceC(checkNullAndReplace(rs.getString("farm_mobile"))));
				cp.setFarm6hrm(replaceC(checkNullAndReplace(rs.getString("farm_6hrm"))));
				cp.setRubberKnife(replaceC(checkNullAndReplace(rs.getString("rubber_knife"))));
				cp.setRubberWalk(replaceC(checkNullAndReplace(rs.getString("rubber_walk"))));
				cp.setRubberDrive(replaceC(checkNullAndReplace(rs.getString("rubber_drive"))));
				cp.setRubberMotor(replaceC(checkNullAndReplace(rs.getString("rubber_motor"))));
				cp.setRubberSquat(replaceC(checkNullAndReplace(rs.getString("rubber_squat"))));
				cp.setRubberBow(replaceC(checkNullAndReplace(rs.getString("rubber_bow"))));
				cp.setRubberStand(replaceC(checkNullAndReplace(rs.getString("rubber_stand"))));
				cp.setRubberHeight(replaceC(checkNullAndReplace(rs.getString("rubber_height"))));
				cp.setRubberHand(replaceC(checkNullAndReplace(rs.getString("rubber_hand"))));
				cp.setRubberKeep(replaceC(checkNullAndReplace(rs.getString("rubber_keep"))));
				cp.setRubberSale(replaceC(checkNullAndReplace(rs.getString("rubber_sale"))));
				cp.setRubberCal(replaceC(checkNullAndReplace(rs.getString("rubber_cal"))));
				cp.setRubberMobile(replaceC(checkNullAndReplace(rs.getString("rubber_mobile"))));
				cp.setRubber6hrm(replaceC(checkNullAndReplace(rs.getString("rubber_6hrm"))));
				cp.setOrcardKnife(replaceC(checkNullAndReplace(rs.getString("orcard_knife"))));
				cp.setOrcardMachine(replaceC(checkNullAndReplace(rs.getString("orcard_machine"))));
				cp.setOrcardClimb(replaceC(checkNullAndReplace(rs.getString("orcard_climb"))));
				cp.setOrcardWater(replaceC(checkNullAndReplace(rs.getString("orcard_water"))));
				cp.setOrcardKeep(replaceC(checkNullAndReplace(rs.getString("orcard_keep"))));
				cp.setOrcardShoulder(replaceC(checkNullAndReplace(rs.getString("orcard_shoulder"))));
				cp.setOrcardBasket(replaceC(checkNullAndReplace(rs.getString("orcard_basket"))));
				cp.setOrcardSale(replaceC(checkNullAndReplace(rs.getString("orcard_sale"))));
				cp.setOrcardDrive(replaceC(checkNullAndReplace(rs.getString("orcard_drive"))));
				cp.setOrcardMotor(replaceC(checkNullAndReplace(rs.getString("orcard_motor"))));
				cp.setOrcardCal(replaceC(checkNullAndReplace(rs.getString("orcard_cal"))));
				cp.setOrcardMobile(replaceC(checkNullAndReplace(rs.getString("orcard_mobile"))));
				cp.setOrcard6hrm(replaceC(checkNullAndReplace(rs.getString("orcard_6hrm"))));
				cp.setRicePrepare(replaceC(checkNullAndReplace(rs.getString("rice_prepare"))));
				cp.setRiceHand(replaceC(checkNullAndReplace(rs.getString("rice_hand"))));
				cp.setRiceMachine(replaceC(checkNullAndReplace(rs.getString("rice_machine"))));
				cp.setRiceWan(replaceC(checkNullAndReplace(rs.getString("rice_wan"))));
				cp.setRiceInjection(replaceC(checkNullAndReplace(rs.getString("rice_injection"))));
				cp.setRiceWater(replaceC(checkNullAndReplace(rs.getString("rice_water"))));
				cp.setRiceDig(replaceC(checkNullAndReplace(rs.getString("rice_dig"))));
				cp.setRiceKeep(replaceC(checkNullAndReplace(rs.getString("rice_keep"))));
				cp.setRiceMotor(replaceC(checkNullAndReplace(rs.getString("rice_motor"))));
				cp.setRiceSale(replaceC(checkNullAndReplace(rs.getString("rice_sale"))));
				cp.setRiceDrive(replaceC(checkNullAndReplace(rs.getString("rice_drive"))));
				cp.setRiceMotorcise(replaceC(checkNullAndReplace(rs.getString("rice_motorcise"))));
				cp.setRiceMobile(replaceC(checkNullAndReplace(rs.getString("rice_mobile"))));
				cp.setRice6hrm(replaceC(checkNullAndReplace(rs.getString("rice_6hrm"))));
				cp.setSurveyBy(replaceC(checkNullAndReplace(rs.getString("survey_by"))));
				resultList.add(cp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return resultList;
	}
	
	public int queryTableHealth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		int i = 0;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT chronic FROM chronic c where c.personal_code = ? group by c.chronic");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return i;
	}
	
	public String queryTableSmoke(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT smoke FROM ncdscreen c where c.personal_code = ? order by date_serv desc");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("smoke");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryTableAlcohol(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT alcohol FROM ncdscreen c where c.personal_code = ? order by date_serv desc");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("alcohol");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryTableDisability(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		int i = 0;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT diagcode FROM disability c where c.personal_code = ? group by c.diagcode");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return String.valueOf(i);
	}
	
	public String queryTableDiagnosisIpd(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM diagnosis_ipd c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryTableDiagnosisOpd(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM diagnosis_opd c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryTableDrugOpd(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM drug_opd c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryTableDrug(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM drug c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryRehabilitation(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM rehabilitation c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryService(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM service c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String queryCommunityService(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM community_service c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String querySpecialpp(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM specialpp c where c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String chronic3Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM chronic c "
					+ "where TO_DATE(c.d_update ,'YYYYMMDDHH24MISS') between to_date('20201001000000','YYYYMMDDHH24MISS') "
					+ "and to_date('20210104000000','YYYYMMDDHH24MISS') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String chronic6Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM chronic c "
					+ "where TO_DATE(c.d_update ,'YYYYMMDDHH24MISS') between to_date('20200701000000','YYYYMMDDHH24MISS') "
					+ "and to_date('20210104000000','YYYYMMDDHH24MISS') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public int chronicAll(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		int Score =0;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM chronic c "
					+ "where c.personal_code = ?"
					+ "group by chronic");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			while (rs.next()) {
				Score++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return Score;
	}
	
	public String diagnosisOpd3Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20201001','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String diagnosisOpd6Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String drugOpd3Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM drug_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20201001','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String drugOpd6Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM drug_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String specialPP3Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM specialpp c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20201001','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String specialPP6Mounth(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT count(*) FROM specialpp c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("count");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String querySpecialPPAdl(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT ppspecial FROM specialpp c where c.personal_code = ? and c.ppspecial like '1B128%' order by date_serv desc");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("ppspecial");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String querySpecialPPFall(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT ppspecial FROM specialpp c where c.personal_code = ? and c.ppspecial like '1B120%' order by date_serv desc");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("ppspecial");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String querySpecialPPEye(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT ppspecial FROM specialpp c where c.personal_code = ? and c.ppspecial like '1B125%' order by date_serv desc");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = rs.getString("ppspecial");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String psychiatricDisorders(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "0";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.diagcode like 'F%' "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = "1";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String mentalDisease(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "0";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.diagcode like 'G%' "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = "1";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String eyeDisease(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "0";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and (c.diagcode like 'H1%' "
					+ "or c.diagcode like 'H2%' "
					+ "or c.diagcode like 'H3%' "
					+ "or c.diagcode like 'H4%' "
					+ "or c.diagcode like 'H5%') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = "1";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String musculoskeletalDisease(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "0";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and c.diagcode like 'M%' "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = "1";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String injury(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "0";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and (c.diagcode like 'S%' or c.diagcode like 'T%') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = "1";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}
	
	public String externalCause(String mappingCode) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String output = "0";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM diagnosis_opd c "
					+ "where TO_DATE(c.date_serv ,'YYYYMMDD') between to_date('20200701','YYYYMMDD') "
					+ "and to_date('20210104','YYYYMMDD') "
					+ "and (c.diagcode like 'V%' or c.diagcode like 'Y%') "
					+ "and c.personal_code = ?");
			pst = conn.prepareStatement(sql.toString());
			pst.setString(1, mappingCode);
			rs = pst.executeQuery();
			if (rs.next()) {
				output = "1";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeStatement(pst, rs, null);
		}
		return output;
	}

	private String checkNullAndReplace(String input) {
		if (input == null || "".equals(input) || "null".equals(input)|| "[NULL]".equals(input)) {
			return "0";
		}else {
			return input;
		}
	}
	
	private String checkNullAndReplaceOth(String input) {
		if (input == null || "".equals(input) || "null".equals(input)|| "[NULL]".equals(input)) {
			return "";
		}else {
			return input;
		}
	}
	
	private String replaceC(String input) {
		try {
			input = input.replace("c", "");
			return input;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	private String replaceGender(String input){				
		if(input.equals("M")) {
			return "1";
		}else if(input.equals("F")) {
			return "0";
		}else {
			return "";
		}
	}
	
	private void closeStatement(Statement st, ResultSet rs, BufferedWriter bw){
		try{
			if(st != null){
				st.close();
			}
			if(rs != null){
				rs.close();
			}
			if(bw != null){
				bw.close();
			}
		}catch (Exception e) {
			System.out.println("ERROR-Closes Statement Error");
			e.printStackTrace();
		}
	}
	
}
