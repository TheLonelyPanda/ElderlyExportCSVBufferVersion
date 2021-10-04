package th.co.eecsv.run;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.java.at.common.utils.ThaiUtil;

import th.co.eecsv.db.DbControl;
import th.co.eecsv.entity.MasterElderlyPerson;
import th.co.eecsv.service.DbService;

public class ExtractProcess {
	public void elderlyExportProcess() {
		DbControl db = new DbControl();
		Connection conn = null;
		try {
			conn = db.getConnectionOra();
			DbService dbService = new DbService(conn);
			ArrayList<MasterElderlyPerson> elderlylist = dbService.getElderlyPerson();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
			Date date = new Date(System.currentTimeMillis());
			String fileName = "E:\\aging\\csv\\Elderly_" + formatter.format(date) + ".csv";
			File file = new File(fileName);
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "tis620"));
			writer.append(
					getUniCode("code_id,mapping_code,area_id,survey_name,survey_date,survey_start_time,survey_end_time,"
							+ "gender,birthday,age,age_range,weight,height,bmi,waistline,waistline_inch,member_total,member_earn_money,member_takecare,education,"
							+ "marital_status,marital_status_oth,medical,medical_oth,residential,house_live,house_belong,house_belong_oth,"
							+ "bedroom,restroom,use_smartphone,use_smartphone_score,help_org,help_org_1,help_org_2,help_org_3,help_org_4,help_org_5,"
							+ "help_org_6,help_org_7,help_org_8,help_skill,help_medical,help_org_oth,income_total,income_source,income_source_score,"
							+ "income_oth,expend_avg,expend_health_year,income_enough,career_flag,career_current,career_current_oth,"
							+ "income_main_total,income_amt,income_detail,income_detail_oth,work_week_hr,distant_km,distant_m,duration_hr,"
							+ "duration_min,work_place,work_travel_type,work_travel_oth,accident,accident_detail,need_job,need_job_hr,"
							+ "wages_flag,wages_expect,job_expect,no_need_job_reason,no_need_job_oth,work_for,work_for_oth,expect_career_group,"
							+ "expect_career_oth,expect_job_hr,expect_wages_hr_type,expect_wages_hr,spec_work,can_work,can_work_oth,work_location,"
							+ "can_travel_self,can_travel_self_oth,work_daytime,work_night,can_run,can_arm,can_shrink,can_see,skill_special,"
							+ "skill_special_oth,skill_special_detail,sts_sleep,sts_concentration,sts_edgy,sts_bored,sts_introvert,sum_sts,sts_group,fall_times,"
							+ "machine_walk,tmse1,tmse2,tmse3,tmse4,tmse5,tmse6,tmse7,tmse8,tmse9,tmse10,tmse11,tmse12,tmse13,tmse14,tmse15,"
							+ "tmse16,tmse17,sum_tmse,tmse_group,pain_neck,pain_shoulder,pain_scapula,pain_elbow,pain_hand,pain_back,pain_hip,pain_knee,pain_foot,pain_score,"
							+ "health_neck,health_back,health_muscle,health_move,health_sit,health_stand,health_bow,health_squatting,health_kneel,"
							+ "health_heavy,health_lifting,health_catch,health_think,health_hearing,health_hand,health_skin,work_skill,work_body,"
							+ "work_think,work_effect,work_leave,work_2yrs,feel_fun,feel_active,feel_hope,disease,disease_detail,disease_detail_1,"
							+ "disease_detail_2,disease_detail_3,disease_detail_4,disease_detail_5,disease_detail_6,disease_detail_7,disease_detail_8,"
							+ "disease_detail_9,disease_detail_10,disease_detail_11,disease_detail_12,disease_oth,section4_score,section4_group,"
							+ "career_need,career_need_1,career_need_2,career_need_3,career_need_4,career_need_5,career_need_6,career_need_oth,career_need_reason,"
							+ "trade_wash,trade_slices,trade_fried,trade_open,trade_reach,"
							+ "trade_raise,trade_carry,trade_drive,trade_motorcise,trade_sit,trade_heavy,trade_wall,trade_cal,trade_mobile,"
							+ "trade_app,trade_sum,farm_prepare,farm_hand,farm_machine,farm_knife,farm_back,farm_water,farm_proan,farm_wan,farm_injection,"
							+ "farm_keep,farm_tool,farm_pack,farm_drive,farm_motorcise,farm_cal,farm_mobile,farm_6hrm,farm_sum,rubber_knife,rubber_walk,"
							+ "rubber_drive,rubber_motor,rubber_squat,rubber_bow,rubber_stand,rubber_height,rubber_hand,rubber_keep,rubber_sale,"
							+ "rubber_cal,rubber_mobile,rubber_6hrm,rubber_sum,orcard_knife,orcard_machine,orcard_climb,orcard_water,orcard_keep,"
							+ "orcard_shoulder,orcard_basket,orcard_sale,orcard_drive,orcard_motor,orcard_cal,orcard_mobile,orcard_6hrm,orcard_sum,"
							+ "rice_prepare,rice_hand,rice_machine,rice_wan,rice_injection,rice_water,rice_dig,rice_keep,rice_motor,rice_sale,"
							+ "rice_drive,rice_motorcise,rice_mobile,rice_6hrm,rice_sum,"
							+ "pain_neck_flag,pain_shoulder_flag,pain_scapula_flag,pain_elbow_flag,pain_hand_flag,pain_back_flag,pain_hip_flag,"
							+ "pain_knee_flag,pain_foot_flag,pain_count,"
							+ "health_neck_flag,health_back_flag,health_muscle_flag,health_move_flag,health_sit_flag,health_stand_flag,"
							+ "health_bow_flag,health_squatting_flag,health_kneel_flag,health_heavy_flag,health_lifting_flag,health_catch_flag,"
							+ "health_think_flag,health_hearing_flag,health_hand_flag,health_skin_flag,health_sum,"
							+ "disease_total,disfunction_upperim,disfunction_lowerrim,disfunction_spine,neural_problem,health_status,"
							+ "health_mental_count,health_body_count,physical_activity,can_see_flag,smoke_flag,alcohol_flag,distant_total,"
							+ "duration_total,medical_count,help_org_sum,career_current_count,work_travel_type_count,work_travel_type_walk,"
							+ "no_need_job_reason_count,no_need_job_reason_health,work_for_count,expect_career_group_count,work_location_home,"
							+ "work_location_site,skill_special_count,career_need_count,dis_ablitiy_count,diagnosis_ipd_count,diagnosis_opd_count,"
							+ "drug_opd_count,drug_count,smoke,alcohol,rehabilitation_count,service_count,community_service_count,specialpp_count,"
							+ "chronic_count_3,chronic_count_6,chronic_count_all,diagnosis_opd_count_3,diagnosis_opd_count_6,"
							+ "drug_opd_count_3,drug_opd_count_6,special_pp_count_3,special_pp_count_6,special_pp_adl,special_pp_fall,"
							+ "special_pp_eye,section4_grade,Area Name,Age Range,psychiatric_disorders,mental_disease,"
							+ "eye_disease,musculoskeletal_disease,injury,external_cause,disease_detail_13,disease_detail_14,disease_detail_15,"
							+ "disease_detail_16,disease_top_3,drug_opd_analgesics_6,drug_opd_hypertension_6,drug_opd_GI_6,drug_opd_decrese_cholesterol_6,"
							+ "drug_opd_anti_histamine_6,drug_opd_herb_6,drug_opd_eyes_ears_6,drug_opd_insulin_6,drug_opd_nauseaandvertigo_6,"
							+ "drug_opd_minerals_6,drug_opd_cough_medicine_6,drug_opd_psychoses_6,section4_grade_label,gender_label,career_flag_label,"
							+ "can_run_flag,occupation_id,occupation_name,occupation_updatedate"+ "\n"));
			
			System.out.println("SYSYEM :: Buffer");
			System.out.println("SYSYEM :: Header ADD!");
			System.out.println("SYSYEM :: Size === "+elderlylist.size());
			int CountRound = 0;
			for (MasterElderlyPerson elderData : elderlylist) {
				
				StringBuffer sectionHead=new StringBuffer();
				StringBuffer sectionProfile=new StringBuffer();
				StringBuffer section1=new StringBuffer();
				StringBuffer section2=new StringBuffer();
				StringBuffer section3=new StringBuffer();
				StringBuffer section4=new StringBuffer();
				StringBuffer section5=new StringBuffer();
				StringBuffer sectionAddOn=new StringBuffer();

				String section4_score = String
						.valueOf(findScore4(elderData.getWorkSkill()) + findScore4(elderData.getWorkBody())
								+ findScore4(elderData.getWorkThink()) + findScore43(elderData.getWorkEffect())
								+ findScore44(elderData.getWorkLeave()) + findScore45(elderData.getWork2yrs())
								+ calScore46(findScore46(elderData.getFeelFun()) + findScore46(elderData.getFeelActive())
								+ findScore46(elderData.getFeelHope())) + findScore47(elderData.getDisease(),elderData.getDiseaseDetail(),elderData.getMappingCode(),dbService));
				String sum_tmse = String.valueOf(findScoreTmse(elderData.getTmse1())
						+ findScoreTmse(elderData.getTmse2()) + findScoreTmse(elderData.getTmse3())
						+ findScoreTmse(elderData.getTmse4()) + findScoreTmse(elderData.getTmse5())
						+ findScoreTmse(elderData.getTmse6()) + findScoreTmse(elderData.getTmse7())
						+ findScoreTmse(elderData.getTmse8()) + findScoreTmse(elderData.getTmse9())
						+ findScoreTmse(elderData.getTmse10()) + findScoreTmse(elderData.getTmse11())
						+ findScoreTmse(elderData.getTmse12()) + findScoreTmse(elderData.getTmse13())
						+ findScoreTmse(elderData.getTmse14()) + findScoreTmse(elderData.getTmse15())
						+ findScoreTmse(elderData.getTmse16()) + findScoreTmse(elderData.getTmse17()));
				String sum_sts = String.valueOf(findScoreSts(elderData.getStsSleep())
						+ findScoreSts(elderData.getStsConcentration()) + findScoreSts(elderData.getStsEDGY())
						+ findScoreSts(elderData.getStsBored()) + findScoreSts(elderData.getStsIntrovert()));
				
				String tmse_group = calTmseGroup(sum_tmse);
				String sts_group = calStsGroup(sum_sts);
				String section4_group = calSection4Group(section4_score);
				
				int ageInt = findAge(elderData.getBirthday());
				String age = String.valueOf(ageInt);
				String age_range = String.valueOf(findAgeRange(ageInt));
				String bmi = findBmi(elderData.getWeight(),elderData.getHeight());
				String waistline_inch = findWaistlineInch(elderData.getWaistline());
				String use_smartphone_score = findSPS(elderData.getUseSmartphone());
				String income_source_score = String.valueOf(findISS(elderData.getIncomeSource()));
				String help_org_1 = spitHelpOrg(elderData.getHelpOrg(),"1");
				String help_org_2 = spitHelpOrg(elderData.getHelpOrg(),"2");
				String help_org_3 = spitHelpOrg(elderData.getHelpOrg(),"3");
				String help_org_4 = spitHelpOrg(elderData.getHelpOrg(),"4");
				String help_org_5 = spitHelpOrg(elderData.getHelpOrg(),"5");
				String help_org_6 = spitHelpOrg(elderData.getHelpOrg(),"6");
				String help_org_7 = spitHelpOrg(elderData.getHelpOrg(),"7");
				String help_org_8 = spitHelpOrg(elderData.getHelpOrg(),"99");
				
				String disease_detail_1 = spitDiseaseDetail(elderData.getDiseaseDetail(),"1");
				String disease_detail_2 = spitDiseaseDetail(elderData.getDiseaseDetail(),"2");
				String disease_detail_3 = spitDiseaseDetail(elderData.getDiseaseDetail(),"3");
				String disease_detail_4 = spitDiseaseDetail(elderData.getDiseaseDetail(),"4");
				String disease_detail_5 = spitDiseaseDetail(elderData.getDiseaseDetail(),"5");
				String disease_detail_6 = spitDiseaseDetail(elderData.getDiseaseDetail(),"6");
				String disease_detail_7 = spitDiseaseDetail(elderData.getDiseaseDetail(),"7");
				String disease_detail_8 = spitDiseaseDetail(elderData.getDiseaseDetail(),"8");
				String disease_detail_9 = spitDiseaseDetail(elderData.getDiseaseDetail(),"9");
				String disease_detail_10 = spitDiseaseDetail(elderData.getDiseaseDetail(),"10");
				String disease_detail_11 = spitDiseaseDetail(elderData.getDiseaseDetail(),"11");
				String disease_detail_12 = spitDiseaseDetail(elderData.getDiseaseDetail(),"12");
				
				String career_need_1 = spitDiseaseDetail(elderData.getCareerNeed(),"1");
				String career_need_2 = spitDiseaseDetail(elderData.getCareerNeed(),"2");
				String career_need_3 = spitDiseaseDetail(elderData.getCareerNeed(),"3");
				String career_need_4 = spitDiseaseDetail(elderData.getCareerNeed(),"4");
				String career_need_5 = spitDiseaseDetail(elderData.getCareerNeed(),"5");
				String career_need_6 = spitDiseaseDetail(elderData.getCareerNeed(),"6");

				
				String pain_score = String.valueOf(findScore(elderData.getPainNeck())+findScore(elderData.getPainShoulder())
									+findScore(elderData.getPainScapula())+findScore(elderData.getPainElbow())
									+findScore(elderData.getPainHand())+findScore(elderData.getPainBack())
									+findScore(elderData.getPainHip())+findScore(elderData.getPainKnee())
									+findScore(elderData.getPainFoot()));
				
				String trade_sum = String.valueOf(findScore(elderData.getTradeWash())+findScore(elderData.getTradeSlices())
									+ findScore(elderData.getTradeFried()) + findScore(elderData.getTradeOpen()) + findScore(elderData.getTradeReach())
									+ findScore(elderData.getTradeRaise()) + findScore(elderData.getTradeCarry()) + findScore(elderData.getTradeDrive())
									+ findScore(elderData.getTradeMotorcise()) + findScore(elderData.getTradeSit()) + findScore(elderData.getTradeHeavy())
									+ findScore(elderData.getTradeWall()) + findScore(elderData.getTradeCal()) + findScore(elderData.getTradeMobile())
									+ findScore(elderData.getTradeApp()));
				
				String farm_sum = String.valueOf(findScore(elderData.getFarmPrepare())  + findScore(elderData.getFarmHand())
				 					+ findScore(elderData.getFarmMachine()) + findScore(elderData.getFarmKnife())  + findScore(elderData.getFarmBack())
				 					+ findScore(elderData.getFarmWater()) + findScore(elderData.getFarmProan())  + findScore(elderData.getFarmWan())
				 					+ findScore(elderData.getFarmInjection()) + findScore(elderData.getFarmKeep())  + findScore(elderData.getFarmTool())
				 					+ findScore(elderData.getFarmPack()) + findScore(elderData.getFarmDrive()) + findScore(elderData.getFarmMotorcise())  
				 					+ findScore(elderData.getFarmCal()) + findScore(elderData.getFarmMobile()) + findScore(elderData.getFarm6hrm()));
				
				String rubber_sum = String.valueOf(findScore(elderData.getRubberKnife())
						 			+ findScore(elderData.getRubberWalk()) + findScore(elderData.getRubberDrive()) 
						 			+ findScore(elderData.getRubberMotor()) + findScore(elderData.getRubberSquat())  + findScore(elderData.getRubberBow())
						 			+ findScore(elderData.getRubberStand()) + findScore(elderData.getRubberHeight()) 
						 			+ findScore(elderData.getRubberHand())  + findScore(elderData.getRubberKeep())
						 			+ findScore(elderData.getRubberSale()) + findScore(elderData.getRubberCal())  + findScore(elderData.getRubberMobile())
						 			+ findScore(elderData.getRubber6hrm()));
				String orchard_sum = String.valueOf(findScore(elderData.getOrcardKnife()) 
									+ findScore(elderData.getOrcardMachine()) + findScore(elderData.getOrcardClimb()) 
									+ findScore(elderData.getOrcardWater())  + findScore(elderData.getOrcardKeep())
									+ findScore(elderData.getOrcardShoulder()) + findScore(elderData.getOrcardBasket()) 
									+ findScore(elderData.getOrcardSale())  + findScore(elderData.getOrcardDrive())
									+ findScore(elderData.getOrcardMotor()) + findScore(elderData.getOrcardCal())  
									+ findScore(elderData.getOrcardMobile())+ findScore(elderData.getOrcard6hrm())) ;
				String rice_sum = String.valueOf(findScore(elderData.getRicePrepare())  + findScore(elderData.getRiceHand())
				 				+ findScore(elderData.getRiceMachine()) + findScore(elderData.getRiceWan())  + findScore(elderData.getRiceInjection())
				 				+ findScore(elderData.getRiceWater()) + findScore(elderData.getRiceDig())  + findScore(elderData.getRiceKeep()) 
				 				+ findScore(elderData.getRiceMotor())  + findScore(elderData.getRiceSale())
				 				+ findScore(elderData.getRiceDrive()) + findScore(elderData.getRiceMotorcise()) 
				 				+ findScore(elderData.getRiceMobile())  + findScore(elderData.getRice6hrm()));
				
				String pain_neck_flag =calFlagPain(elderData.getPainNeck());
				String pain_shoulder_flag =calFlagPain(elderData.getPainShoulder());	
				String pain_scapula_flag =calFlagPain(elderData.getPainScapula());
				String pain_elbow_flag =calFlagPain(elderData.getPainElbow());
				String pain_hand_flag =calFlagPain(elderData.getPainHand());
				String pain_back_flag =calFlagPain(elderData.getPainBack());
				String pain_hip_flag =calFlagPain(elderData.getPainHip());
				String pain_knee_flag =calFlagPain(elderData.getPainKnee());
				String pain_foot_flag =calFlagPain(elderData.getPainFoot());
				String pain_count = String.valueOf(Integer.parseInt(pain_neck_flag)+Integer.parseInt(pain_shoulder_flag)
				+Integer.parseInt(pain_scapula_flag)+Integer.parseInt(pain_elbow_flag)
				+Integer.parseInt(pain_hand_flag)+Integer.parseInt(pain_back_flag)
				+Integer.parseInt(pain_hip_flag)+Integer.parseInt(pain_knee_flag)+Integer.parseInt(pain_foot_flag));
				
				String health_neck_flag =calFlagHealth(elderData.getHealthNeck());
				String health_back_flag =calFlagHealth(elderData.getHealthBack());
				String health_muscle_flag =calFlagHealth(elderData.getHealthMuscle());
				String health_move =calFlagHealth(elderData.getHealthMove());
				String health_sit_flag =calFlagHealth(elderData.getHealthSit());
				String health_stand_flag =calFlagHealth(elderData.getHealthStand());
				String health_bow_flag =calFlagHealth(elderData.getHealthBow());
				String health_squatting_flag =calFlagHealth(elderData.getHealthSquatting());
				String health_kneel_flag =calFlagHealth(elderData.getHealthKneel());
				String health_heavy_flag =calFlagHealth(elderData.getHealthHeavy());
				String health_lifting_flag =calFlagHealth(elderData.getHealthLifting());
				String health_catch_flag =calFlagHealth(elderData.getHealthCatch());
				String health_think_flag =calFlagHealth(elderData.getHealthThink());
				String health_hearing_flag =calFlagHealth(elderData.getHealthHearing());
				String health_hand_flag =calFlagHealth(elderData.getHealthHand());
				String health_skin_flag =calFlagHealth(elderData.getHealthSkin());
				String health_sum = String.valueOf(Integer.parseInt(health_neck_flag)
				+Integer.parseInt(health_back_flag)+Integer.parseInt(health_muscle_flag)
				+Integer.parseInt(health_move)+Integer.parseInt(health_sit_flag)
				+Integer.parseInt(health_stand_flag)+Integer.parseInt(health_bow_flag)
				+Integer.parseInt(health_squatting_flag)+Integer.parseInt(health_kneel_flag)
				+Integer.parseInt(health_heavy_flag)+Integer.parseInt(health_lifting_flag)
				+Integer.parseInt(health_catch_flag)+Integer.parseInt(health_think_flag)
				+Integer.parseInt(health_hearing_flag)+Integer.parseInt(health_hand_flag)
				+Integer.parseInt(health_skin_flag));
				
				String disease_total = String.valueOf(findDiseaseTotal(elderData.getDisease(),elderData.getDiseaseDetail(),elderData.getMappingCode(),dbService));
				
				String disfunction_upperim = calHealthScore(Integer.parseInt(health_move)+Integer.parseInt(health_lifting_flag)
						+Integer.parseInt(health_catch_flag));
				String disfunction_lowerrim = calHealthScore(Integer.parseInt(health_move)+Integer.parseInt(health_stand_flag)
						+Integer.parseInt(health_squatting_flag)+Integer.parseInt(health_kneel_flag));
				String disfunction_spine = calHealthScore(Integer.parseInt(health_sit_flag)+Integer.parseInt(health_stand_flag)
						+Integer.parseInt(health_bow_flag)+Integer.parseInt(health_heavy_flag)+Integer.parseInt(health_lifting_flag));
				String neural_problem = calHealthScore(Integer.parseInt(health_neck_flag)+Integer.parseInt(health_back_flag)
						+Integer.parseInt(health_catch_flag)+Integer.parseInt(health_hand_flag));
				
				String health_status = calHealthStatus(disease_total);
				
				String health_mental_count = String.valueOf(Integer.parseInt(disease_detail_7)
						+Integer.parseInt(disease_detail_10)+Integer.parseInt(disease_detail_11));
				
				String health_body_count =  String.valueOf(Integer.parseInt(disease_detail_1)
						+Integer.parseInt(disease_detail_2)+Integer.parseInt(disease_detail_3)
						+Integer.parseInt(disease_detail_4)+Integer.parseInt(disease_detail_5)
						+Integer.parseInt(disease_detail_6)+Integer.parseInt(disease_detail_8)
						+Integer.parseInt(disease_detail_9)+Integer.parseInt(disease_detail_12));
				
				String physical_activity = findPA(elderData.getCareerCurrent());
				
				String can_see_flag = findCanSee(elderData.getCanSee());
				
				String smoke_flag =findSmoke(elderData.getMappingCode(),dbService);
				String alcohol_flag =findAlcohol(elderData.getMappingCode(),dbService);
				
				String distant_total  = String.valueOf((Integer.parseInt(elderData.getDistantKm())*1000)+Integer.parseInt(elderData.getDistantM()));
				String duration_total = String.valueOf((Integer.parseInt(elderData.getDurationHr())*60)+Integer.parseInt(elderData.getDurationMin()));
				
				String medical_count = findArrayCount(elderData.getMedical());
				String help_org_sum =  String.valueOf(Integer.parseInt(help_org_1)
						+Integer.parseInt(help_org_2)+Integer.parseInt(help_org_3)
						+Integer.parseInt(help_org_4)+Integer.parseInt(help_org_5)
						+Integer.parseInt(help_org_6)+Integer.parseInt(help_org_7)
						+Integer.parseInt(help_org_8));
				
				String career_current_count = findArrayCount(elderData.getCareerCurrent());
				
				String work_travel_type_count = findArrayCount(elderData.getWorkTravelType());
				String work_travel_type_walk = findTTW(elderData.getWorkTravelType());
				
				String no_need_job_reason_count = findArrayCount(elderData.getNoNeedJobReason());
				String no_need_job_reason_health = findNNJRH(elderData.getNoNeedJobReason());
				String work_for_count = findArrayCount(elderData.getWorkFor());
				String expect_career_group_count = findArrayCount(elderData.getExpectCareerGroup());
				String work_location_home = findWLH(elderData.getWorkLocation());
				String work_location_site = findWLS(elderData.getWorkLocation());
				String skill_special_count = findArrayCount(elderData.getSkillSpecial());
				String career_need_count = findArrayCount(elderData.getCareerNeed());
				String dis_ablitiy_count = dbService.queryTableDisability(elderData.getMappingCode());
				String diagnosis_ipd_count = dbService.queryTableDiagnosisIpd(elderData.getMappingCode());
				String diagnosis_opd_count = dbService.queryTableDiagnosisOpd(elderData.getMappingCode());
				String drug_opd_count = dbService.queryTableDrugOpd(elderData.getMappingCode());
				String drug_count = dbService.queryTableDrug(elderData.getMappingCode());
				
				String smoke = dbService.queryTableSmoke(elderData.getMappingCode());
				String alcohol = dbService.queryTableAlcohol(elderData.getMappingCode());
				String rehabilitation_count = dbService.queryRehabilitation(elderData.getMappingCode());
				String service_count = dbService.queryService(elderData.getMappingCode());
				String community_service_count = dbService.queryCommunityService(elderData.getMappingCode());
				String specialpp_count = dbService.querySpecialpp(elderData.getMappingCode());
				
				String chronic_count_3 = dbService.chronic3Mounth(elderData.getMappingCode());
				String chronic_count_6 = dbService.chronic6Mounth(elderData.getMappingCode());
				String chronic_count_all = String.valueOf(dbService.chronicAll(elderData.getMappingCode()));
				String diagnosis_opd_count_3 = dbService.diagnosisOpd3Mounth(elderData.getMappingCode());
				String diagnosis_opd_count_6 = dbService.diagnosisOpd6Mounth(elderData.getMappingCode());
				String drug_opd_count_3 = dbService.drugOpd3Mounth(elderData.getMappingCode());
				String drug_opd_count_6 = dbService.drugOpd6Mounth(elderData.getMappingCode());
				String special_pp_count_3 = dbService.specialPP3Mounth(elderData.getMappingCode());
				String special_pp_count_6 = dbService.specialPP6Mounth(elderData.getMappingCode());
				String special_pp_adl = calSPPAdl(dbService.querySpecialPPAdl(elderData.getMappingCode()));
				String special_pp_fall = calSPPFall(dbService.querySpecialPPFall(elderData.getMappingCode()));
				String special_pp_eye = calSPPEye(dbService.querySpecialPPEye(elderData.getMappingCode()));
				String section4_grade = calSection4Grade(section4_score);
				String area_name_lable = changeAreaName(elderData.getAreaId());
				String age_range_lable = changeAgeRange(age_range);
				
				String psychiatric_disorders = dbService.psychiatricDisorders(elderData.getMappingCode());
				String mental_disease = dbService.mentalDisease(elderData.getMappingCode());
				String eye_disease = dbService.eyeDisease(elderData.getMappingCode());
				String musculoskeletal_disease = dbService.musculoskeletalDisease(elderData.getMappingCode());
				String injury = dbService.injury(elderData.getMappingCode());
				String external_cause = dbService.externalCause(elderData.getMappingCode());
				
				String disease_detail_13 = findDiseaseOth(elderData.getDiseaseOth(),"ไขมัน");
				String disease_detail_14 = findDiseaseOth(elderData.getDiseaseOth(),"ไทรอย");
				String disease_detail_15 = findDiseaseOth(elderData.getDiseaseOth(),"ไต");
				String disease_detail_16 = findDiseaseOth(elderData.getDiseaseOth(),"กระเพาะ");
				String disease_top_3 = seeTop3(disease_detail_1,disease_detail_2,disease_detail_3);
				
				String drug_opd_analgesics_6= dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาแก้อักเสบ");
				String drug_opd_hypertension_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาความดันโลหิตสูง11");
				String drug_opd_GI_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยารักษาระบบทางเดินอาหาร");
				String drug_opd_decrese_cholesterol_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาลดไขมัน");
				String drug_opd_anti_histamine_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาแก้แพ้11");
				String drug_opd_herb_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาสมุนไพร");
				String drug_opd_eyes_ears_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาหยอดตาและหู");
				String drug_opd_insulin_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาเบาหวาน11");
				String drug_opd_nauseaandvertigo_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาแก้คลื่นไส้ อาเจียน11");
				String drug_opd_minerals_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"วิตามิน");
				String drug_opd_cough_medicine_6 = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาแก้ไอ");
				String drug_opd_psychoses_6  = dbService.drugOpdDisease6(elderData.getMappingCode(),"ยาจิตเวช11");
				
				String section4_grade_label = section4GradeToLable(section4_grade);
				String gender_label = genderToLable(elderData.getGender());
				String career_flag_label = careerToLable(elderData.getCareerFlag());
				
				String can_run_flag = calCanRun(elderData.getCanRun());
				
				HashMap<String, String> output = dbService.queryOccupation(elderData.getMappingCode());
				String occupation_id = output.get("occupation_id");
				String occupation_name = output.get("occupation_name");
				String occupation_updatedate = output.get("occupation_updatedate");
				
				
				//Section Head
				sectionHead.append(replaceForInput(elderData.getSurveyName()));
				sectionHead.append(",");
				sectionHead.append(replaceForInput(elderData.getSurveyDate()));
				sectionHead.append(",");
				sectionHead.append(replaceForInput(elderData.getSurveyStartTime()));
				sectionHead.append(",");
				sectionHead.append(replaceForInput(elderData.getSurveyEndTime()));

				//Section Profile
				sectionProfile.append(replaceForInput(elderData.getGender()));
				sectionProfile.append(",");
				sectionProfile.append(replaceForInput(elderData.getBirthday()));
				sectionProfile.append(",");
				sectionProfile.append(age); 
				sectionProfile.append(",");
				sectionProfile.append(age_range);
				sectionProfile.append(",");
				sectionProfile.append(replaceForInput(elderData.getWeight()));
				sectionProfile.append(","); 
				sectionProfile.append(replaceForInput(elderData.getHeight())); 
				sectionProfile.append(","); 
				sectionProfile.append(bmi); 
				sectionProfile.append(","); 
				sectionProfile.append(replaceForInput(elderData.getWaistline())); 
				sectionProfile.append(","); 
				sectionProfile.append(waistline_inch); 
				sectionProfile.append(","); 
				sectionProfile.append(replaceForInput(elderData.getMemberTotal()));
				sectionProfile.append(","); 
				sectionProfile.append(replaceForInput(elderData.getMemberEarnMoney())); 
				sectionProfile.append(",");
				sectionProfile.append(replaceForInput(elderData.getMemberTakecare()));

				//Section1
				section1.append(replaceForInput(elderData.getEducation())); 
				section1.append(",");
				section1.append(replaceForInput(elderData.getMaritalStatus()));
				section1.append(",");
				section1.append(replaceForInput(elderData.getMaritalStatusOth())); 
				section1.append(",");
				section1.append(replaceForInput(elderData.getMedical())); 
				section1.append(","); 
				section1.append(replaceForInput(elderData.getMedicalOth()));
				section1.append(","); 
				section1.append(replaceForInput(elderData.getResidential())); 
				section1.append(",");
				section1.append(replaceForInput(elderData.getHouseLive())); 
				section1.append(","); 
				section1.append(replaceForInput(elderData.getHouseBelong()));
				section1.append(","); 
				section1.append(replaceForInput(elderData.getHouseBelongOth())); 
				section1.append(",");
				section1.append(replaceForInput(elderData.getBedroom()));
				section1.append(","); 
				section1.append(replaceForInput(elderData.getRestroom()));
				section1.append(",");
				section1.append(replaceForInput(elderData.getUseSmartphone()));
				section1.append(","); 
				section1.append(use_smartphone_score); 
				section1.append(","); 
				section1.append(replaceForInput(elderData.getHelpOrg()));
				section1.append(","); 
				section1.append(help_org_1); 
				section1.append(","); 
				section1.append(help_org_2); 
				section1.append(","); 
				section1.append(help_org_3); 
				section1.append(","); 
				section1.append(help_org_4); 
				section1.append(","); 
				section1.append(help_org_5);
				section1.append(","); 
				section1.append(help_org_6); 
				section1.append(","); 
				section1.append(help_org_7); 
				section1.append(","); 
				section1.append(help_org_8); 
				section1.append(","); 
				section1.append(replaceForInput(elderData.getHelpSkill())); 
				section1.append(",");
				section1.append(replaceForInput(elderData.getHelpMedical())); 
				section1.append(",");
				section1.append(replaceForInput(elderData.getHelpOrgOth()));

				//Section2
				section2.append(replaceForInput(elderData.getIncomeTotal())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getIncomeSource())); 
				section2.append(","); 
				section2.append(income_source_score); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getIncomeOth()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getExpendAvg())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getExpendHealthYear())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getIncomeEnough())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getCareerFlag())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getCareerCurrent())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getCareerCurrentOth())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getIncomeMainTotal())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getIncomeAmt())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getIncomeDetail()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getIncomeDetailOth())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getWorkWeekHr())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getDistantKm()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getDistantM())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getDurationHr())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getDurationMin()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getWorkPlace())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getWorkTravelType())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getWorkTravelOth())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getAccident()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getAccidentDetail())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getNeedJob())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getNeedJobHr()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getWagesFlag())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getWagesExpect())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getJobExpect()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getNoNeedJobReason())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getNoNeedJobOth())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getWorkFor()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getWorkForOth())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getExpectCareerGroup())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getExpectCareerOth())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getExpectJobHr())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getExpectWagesHrType())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getExpectWagesHr())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getSpecWork()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getCanWork())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getCanWorkOth())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getWorkLocation())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getCanTravelSelf())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getCanTravelSelfOth())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getWorkDaytime())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getWorkNight()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getCanRun())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getCanArm()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getCanShrink())); 
				section2.append(","); 
				section2.append(replaceForInput(elderData.getCanSee()));
				section2.append(","); 
				section2.append(replaceForInput(elderData.getSkillSpecial())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getSkillSpecialOth())); 
				section2.append(",");
				section2.append(replaceForInput(elderData.getSkillSpecialDetail()));

				//Section3
				section3.append(replaceForInput(elderData.getStsSleep())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getStsConcentration())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getStsEDGY())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getStsBored())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getStsIntrovert())); 
				section3.append(","); 
				section3.append(sum_sts); 
				section3.append(","); 
				section3.append(sts_group); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getFallTimes())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getMachineWalk()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse1())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse2()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse3())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse4()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse5())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse6()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse7())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse8()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse9())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse10()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse11())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse12()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse13())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse14()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse15())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse16()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getTmse17())); 
				section3.append(","); 
				section3.append(sum_tmse); 
				section3.append(","); 
				section3.append(tmse_group); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getPainNeck())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getPainShoulder()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getPainScapula())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getPainElbow())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getPainHand()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getPainBack())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getPainHip()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getPainKnee())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getPainFoot())); 
				section3.append(","); 
				section3.append(pain_score); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getHealthNeck()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getHealthBack())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthMuscle())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthMove())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getHealthSit()));
				section3.append(","); 
				section3.append(replaceForInput(elderData.getHealthStand())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthBow())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthSquatting())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthKneel())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthHeavy())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthLifting())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthCatch())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthThink())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthHearing())); 
				section3.append(",");
				section3.append(replaceForInput(elderData.getHealthHand())); 
				section3.append(","); 
				section3.append(replaceForInput(elderData.getHealthSkin()));

				//Section4
				section4.append(replaceForInput(elderData.getWorkSkill())); 
				section4.append(",");
				section4.append(replaceForInput(elderData.getWorkBody())); 
				section4.append(","); 
				section4.append(replaceForInput(elderData.getWorkThink()));
				section4.append(","); 
				section4.append(replaceForInput(elderData.getWorkEffect())); 
				section4.append(",");
				section4.append(replaceForInput(elderData.getWorkLeave())); 
				section4.append(","); 
				section4.append(replaceForInput(elderData.getWork2yrs()));
				section4.append(","); 
				section4.append(replaceForInput(elderData.getFeelFun())); 
				section4.append(",");
				section4.append(replaceForInput(elderData.getFeelActive())); 
				section4.append(","); 
				section4.append(replaceForInput(elderData.getFeelHope()));
				section4.append(","); 
				section4.append(replaceForInput(elderData.getDisease())); 
				section4.append(",");
				section4.append(replaceForInput(elderData.getDiseaseDetail())); 
				section4.append(",");
				section4.append(disease_detail_1); 
				section4.append(","); 
				section4.append(disease_detail_2); 
				section4.append(","); 
				section4.append(disease_detail_3); 
				section4.append(","); 
				section4.append(disease_detail_4); 
				section4.append(",");
				section4.append(disease_detail_5); 
				section4.append(","); 
				section4.append(disease_detail_6); 
				section4.append(","); 
				section4.append(disease_detail_7); 
				section4.append(","); 
				section4.append(disease_detail_8); 
				section4.append(",");
				section4.append(disease_detail_9); 
				section4.append(","); 
				section4.append(disease_detail_10); 
				section4.append(","); 
				section4.append(disease_detail_11); 
				section4.append(","); 
				section4.append(disease_detail_12); 
				section4.append(",");
				section4.append(replaceForInput(elderData.getDiseaseOth())); 
				section4.append(","); 
				section4.append(section4_score); 
				section4.append(","); 
				section4.append(section4_group);

				//Section5
				section5.append(replaceForInput(elderData.getCareerNeed()));
				section5.append(",");
				section5.append(career_need_1);
				section5.append(",");
				section5.append(career_need_2);
				section5.append(",");
				section5.append(career_need_3);
				section5.append(",");
				section5.append(career_need_4);
				section5.append(",");
				section5.append(career_need_5);
				section5.append(",");
				section5.append(career_need_6);
				section5.append(",");
				section5.append(replaceForInput(elderData.getCareerNeedOth())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getCareerNeedReason())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getTradeWash())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeSlices()));
				section5.append(",");
				section5.append(replaceForInput(elderData.getTradeFried())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getTradeOpen())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeReach()));
				section5.append(",");
				section5.append(replaceForInput(elderData.getTradeRaise())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getTradeCarry())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeDrive()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeMotorcise())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getTradeSit()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeHeavy()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeWall())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getTradeCal()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeMobile()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getTradeApp())); 
				section5.append(","); 
				section5.append(trade_sum); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getFarmPrepare())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmHand()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmMachine())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getFarmKnife()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmBack()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmWater())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getFarmProan())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmWan()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmInjection())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getFarmKeep())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmTool()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmPack())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getFarmDrive())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getFarmMotorcise())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmCal()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getFarmMobile())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getFarm6hrm())); 
				section5.append(","); 
				section5.append(farm_sum); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubberKnife()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubberWalk())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRubberDrive())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRubberMotor())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRubberSquat())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubberBow()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubberStand())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRubberHeight())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRubberHand())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubberKeep()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubberSale())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRubberCal())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubberMobile()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRubber6hrm())); 
				section5.append(","); 
				section5.append(rubber_sum); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getOrcardKnife())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getOrcardMachine())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getOrcardClimb())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getOrcardWater())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getOrcardKeep()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getOrcardShoulder())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getOrcardBasket())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getOrcardSale())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getOrcardDrive()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getOrcardMotor())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getOrcardCal())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getOrcardMobile()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getOrcard6hrm())); 
				section5.append(","); 
				section5.append(orchard_sum); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRicePrepare())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRiceHand()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRiceMachine())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRiceWan())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRiceInjection()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRiceWater())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRiceDig())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRiceKeep())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRiceMotor())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRiceSale()));
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRiceDrive())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRiceMotorcise())); 
				section5.append(",");
				section5.append(replaceForInput(elderData.getRiceMobile())); 
				section5.append(","); 
				section5.append(replaceForInput(elderData.getRice6hrm())); 
				section5.append(","); 
				section5.append(rice_sum);
				
				//Section Add On
				sectionAddOn.append(pain_neck_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_shoulder_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_scapula_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_elbow_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_hand_flag);
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_back_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_hip_flag); 
				sectionAddOn.append(",");  
				sectionAddOn.append(pain_knee_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_foot_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(pain_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_neck_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_back_flag); 
				sectionAddOn.append(",");
				sectionAddOn.append(health_muscle_flag); 
				sectionAddOn.append(",");
				sectionAddOn.append(health_move); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_sit_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_stand_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_bow_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_squatting_flag);
				sectionAddOn.append(","); 
				sectionAddOn.append(health_kneel_flag);
				sectionAddOn.append(",");
				sectionAddOn.append(health_heavy_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_lifting_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_catch_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_think_flag);
				sectionAddOn.append(","); 
				sectionAddOn.append(health_hearing_flag); 
				sectionAddOn.append(",");
				sectionAddOn.append(health_hand_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_skin_flag);
				sectionAddOn.append(",");
				sectionAddOn.append(health_sum);
				sectionAddOn.append(","); 
				sectionAddOn.append(disease_total); 
				sectionAddOn.append(",");
				sectionAddOn.append(disfunction_upperim); 
				sectionAddOn.append(","); 
				sectionAddOn.append(disfunction_lowerrim); 
				sectionAddOn.append(","); 
				sectionAddOn.append(disfunction_spine); 
				sectionAddOn.append(","); 
				sectionAddOn.append(neural_problem);
				sectionAddOn.append(","); 
				sectionAddOn.append(health_status); 
				sectionAddOn.append(",");
				sectionAddOn.append(health_mental_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(health_body_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(physical_activity); 
				sectionAddOn.append(",");
				sectionAddOn.append(can_see_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(smoke_flag);
				sectionAddOn.append(","); 
				sectionAddOn.append(alcohol_flag); 
				sectionAddOn.append(","); 
				sectionAddOn.append(distant_total);
				sectionAddOn.append(","); 
				sectionAddOn.append(duration_total);
				sectionAddOn.append(","); 
				sectionAddOn.append(medical_count); 
				sectionAddOn.append(",");
				sectionAddOn.append(help_org_sum); 
				sectionAddOn.append(","); 
				sectionAddOn.append(career_current_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(work_travel_type_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(work_travel_type_walk); 
				sectionAddOn.append(","); 
				sectionAddOn.append(no_need_job_reason_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(no_need_job_reason_health); 
				sectionAddOn.append(","); 
				sectionAddOn.append(work_for_count);
				sectionAddOn.append(","); 
				sectionAddOn.append(expect_career_group_count);
				sectionAddOn.append(","); 
				sectionAddOn.append(work_location_home); 
				sectionAddOn.append(","); 
				sectionAddOn.append(work_location_site); 
				sectionAddOn.append(","); 
				sectionAddOn.append(skill_special_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(career_need_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(dis_ablitiy_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(diagnosis_ipd_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(diagnosis_opd_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(smoke); 
				sectionAddOn.append(","); 
				sectionAddOn.append(alcohol); 
				sectionAddOn.append(",");
				sectionAddOn.append(rehabilitation_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(service_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(community_service_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(specialpp_count); 
				sectionAddOn.append(","); 
				sectionAddOn.append(chronic_count_3); 
				sectionAddOn.append(",");
				sectionAddOn.append(chronic_count_6); 
				sectionAddOn.append(","); 
				sectionAddOn.append(chronic_count_all); 
				sectionAddOn.append(","); 
				sectionAddOn.append(diagnosis_opd_count_3); 
				sectionAddOn.append(","); 
				sectionAddOn.append(diagnosis_opd_count_6); 
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_count_3); 
				sectionAddOn.append(",");
				sectionAddOn.append(drug_opd_count_6); 
				sectionAddOn.append(","); 
				sectionAddOn.append(special_pp_count_3); 
				sectionAddOn.append(","); 
				sectionAddOn.append(special_pp_count_6); 
				sectionAddOn.append(","); 
				sectionAddOn.append(special_pp_adl); 
				sectionAddOn.append(","); 
				sectionAddOn.append(special_pp_fall); 
				sectionAddOn.append(",");
				sectionAddOn.append(special_pp_eye); 
				sectionAddOn.append(","); 
				sectionAddOn.append(section4_grade); 
				sectionAddOn.append(","); 
				sectionAddOn.append(area_name_lable); 
				sectionAddOn.append(","); 
				sectionAddOn.append(age_range_lable);
				sectionAddOn.append(","); 
				sectionAddOn.append(psychiatric_disorders);
				sectionAddOn.append(","); 
				sectionAddOn.append(mental_disease);
				sectionAddOn.append(","); 
				sectionAddOn.append(eye_disease);
				sectionAddOn.append(","); 
				sectionAddOn.append(musculoskeletal_disease);
				sectionAddOn.append(","); 
				sectionAddOn.append(injury);
				sectionAddOn.append(","); 
				sectionAddOn.append(external_cause);
				sectionAddOn.append(","); 
				sectionAddOn.append(disease_detail_13);
				sectionAddOn.append(","); 
				sectionAddOn.append(disease_detail_14);
				sectionAddOn.append(","); 
				sectionAddOn.append(disease_detail_15);
				sectionAddOn.append(","); 
				sectionAddOn.append(disease_detail_16);
				sectionAddOn.append(","); 
				sectionAddOn.append(disease_top_3);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_analgesics_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_hypertension_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_GI_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_decrese_cholesterol_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_anti_histamine_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_herb_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_eyes_ears_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_insulin_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_nauseaandvertigo_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_minerals_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_cough_medicine_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(drug_opd_psychoses_6);
				sectionAddOn.append(","); 
				sectionAddOn.append(section4_grade_label);
				sectionAddOn.append(","); 
				sectionAddOn.append(gender_label);
				sectionAddOn.append(","); 
				sectionAddOn.append(career_flag_label);
				sectionAddOn.append(","); 
				sectionAddOn.append(can_run_flag);
				sectionAddOn.append(","); 
				sectionAddOn.append(occupation_id);
				sectionAddOn.append(","); 
				sectionAddOn.append(occupation_name);
				sectionAddOn.append(","); 
				sectionAddOn.append(occupation_updatedate);
				
				
				writer.append(getUniCode(replaceForInput(elderData.getCodeId()) + ","
						+ replaceForInput(elderData.getMappingCode()) + "," + replaceForInput(elderData.getAreaId())
						+ "," + sectionHead + "," + sectionProfile + "," + section1 + "," + section2 + "," + section3
						+ "," + section4 + "," + section5 + "," + sectionAddOn + "\n"));
				
				CountRound++;
				System.out.println("SYSYEM :: Fin one Rec " + CountRound);
			}

			writer.flush();
			writer.close();

		} catch (Exception e) {
			System.out.println("ERROR elderlyExportProcess");
			e.printStackTrace();
		}
	}

	private String getUniCode(String input) {
		// For Dev Linux
		if (input != null)
			return ThaiUtil.ASCII2Unicode(input);
		else
			return input;
		// IF On production no Encode
		// return input;

	}

	private String replaceForInput(String input) {
		if (input == null || "".equals(input) || "null".equals(input) || "[NULL]".equals(input)) {
			return "";
		} else {
			try {
				if (input.indexOf("]") > 1) {
					input = input.replace("[", "\"[\"");
					input = input.replace(",", "\",\"");
					input = input.replace("]", "\"]\"");
				} else {
					input = "\"" + input + "\"";
				}
				return input;
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
		}
	}

	private int findScore4(String input) {
		int score = 0;
		try {
			if (input.indexOf("10") != -1) {
				score = 10;
			} else if (input.indexOf("99") != -1) {
				score = 0;
			} else if (input.indexOf("1") != -1) {
				score = 1;
			} else if (input.indexOf("2") != -1) {
				score = 2;
			} else if (input.indexOf("3") != -1) {
				score = 3;
			} else if (input.indexOf("4") != -1) {
				score = 4;
			} else if (input.indexOf("5") != -1) {
				score = 5;
			} else if (input.indexOf("6") != -1) {
				score = 6;
			} else if (input.indexOf("7") != -1) {
				score = 7;
			} else if (input.indexOf("8") != -1) {
				score = 8;
			} else if (input.indexOf("9") != -1) {
				score = 9;
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findScore43(String input) {
		int score = 0;
		try {
			if (input.indexOf("99") != -1) {
				score = 0;
			} else if (input.indexOf("1") != -1) {
				score = 6;
			} else if (input.indexOf("2") != -1) {
				score = 5;
			} else if (input.indexOf("3") != -1) {
				score = 4;
			} else if (input.indexOf("4") != -1) {
				score = 3;
			} else if (input.indexOf("5") != -1) {
				score = 2;
			} else if (input.indexOf("6") != -1) {
				score = 1;
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findScore44(String input) {
		int score = 0;
		try {
			if (input.indexOf("99") != -1) {
				score = 0;
			} else if (input.indexOf("1") != -1) {
				score = 5;
			} else if (input.indexOf("2") != -1) {
				score = 4;
			} else if (input.indexOf("3") != -1) {
				score = 3;
			} else if (input.indexOf("4") != -1) {
				score = 2;
			} else if (input.indexOf("5") != -1) {
				score = 1;
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findScore45(String input) {
		int score = 0;
		try {
			if (input.indexOf("99") != -1) {
				score = 0;
			} else if (input.indexOf("1") != -1) {
				score = 7;
			} else if (input.indexOf("2") != -1) {
				score = 4;
			} else if (input.indexOf("3") != -1) {
				score = 1;
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findScore46(String input) {
		int score = 0;
		try {
			if (input.indexOf("99") != -1) {
				score = 0;
			} else if (input.indexOf("1") != -1) {
				score = 0;
			} else if (input.indexOf("2") != -1) {
				score = 1;
			} else if (input.indexOf("3") != -1) {
				score = 2;
			} else if (input.indexOf("4") != -1) {
				score = 3;
			} else if (input.indexOf("5") != -1) {
				score = 4;
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	private int calScore46(int input) {
		int score = 0;
		try {
			if (input >= 0 && input <= 3) {
				score = 1;
			} else if (input >= 4 && input <= 6) {
				score = 2;
			} else if (input >= 7 && input <= 9) {
				score = 2;
			} else if (input >= 10 && input <= 12) {
				score = 3;
			} else {
				score = 0;
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

	private int findScore47(String disease,String diseaseDetail,String mappingCode,DbService dbService) {
		int score = 0;
		int count = 0;
		try {
			if (disease.indexOf("3") != -1) {
				if (diseaseDetail.indexOf(",") == -1) {
					if (diseaseDetail.indexOf("10") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("11") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("12") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("99") != -1) {
						score = 0;
					} else if (diseaseDetail.indexOf("1") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("2") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("3") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("4") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("5") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("6") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("7") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("8") != -1) {
						score = 5;
					} else if (diseaseDetail.indexOf("9") != -1) {
						score = 5;
					} else {
						score = 7;
					}
				} else {
					String[] arrayData = diseaseDetail.split(",", -1);
					for (String data : arrayData) {
						if (data.indexOf("10") != -1) {
							count++;
						} else if (data.indexOf("11") != -1) {
							count++;
						} else if (data.indexOf("12") != -1) {
							count++;
						} else if (data.indexOf("99") != -1) {
							count++;
						} else if (data.indexOf("1") != -1) {
							count++;
						} else if (data.indexOf("2") != -1) {
							count++;
						} else if (data.indexOf("3") != -1) {
							count++;
						} else if (data.indexOf("4") != -1) {
							count++;
						} else if (data.indexOf("5") != -1) {
							count++;
						} else if (data.indexOf("6") != -1) {
							count++;
						} else if (data.indexOf("7") != -1) {
							count++;
						} else if (data.indexOf("8") != -1) {
							count++;
						} else if (data.indexOf("9") != -1) {
							count++;
						}
					}

					if (count >= 5) {
						score = 1;
					} else if (count == 4) {
						score = 2;
					} else if (count == 3) {
						score = 3;
					} else if (count == 2) {
						score = 4;
					}
				}
			}else if (disease.indexOf("1") != -1) {
				score = 7;
			}else if (disease.indexOf("2") != -1) {
				count = dbService.queryTableHealth(mappingCode);
				if (count >= 5) {
					score = 1;
				} else if (count == 4) {
					score = 2;
				} else if (count == 3) {
					score = 3;
				} else if (count == 2) {
					score = 4;
				} else if (count == 1) {
					score = 5;
				} else if (count == 0) {
					score = 7;
				}
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findScoreTmse(String input) {
		int score = 0;
		try {
			if (input == null || "".equals(input) || "null".equals(input) || "[NULL]".equals(input)) {
				score = 0;
			} else {
				if (input.equals("99")) {
					score = 0;
				} else {
					score = Integer.parseInt(input);
				}
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findScoreSts(String input) {
		int score = 0;
		try {
			if (input == null || "".equals(input) || "null".equals(input) || "[NULL]".equals(input)) {
				score = 0;
			} else {
				if (input.equals("99")) {
					score = 0;
				} else if (input.equals("1")) {
					score = 0;
				} else if (input.equals("2")) {
					score = 1;
				} else if (input.equals("3")) {
					score = 2;
				} else if (input.equals("4")) {
					score = 3;
				}
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findAge(String input) {
		LocalDate today = LocalDate.now();
		int score = 0;
		try {
			if (input == null || "".equals(input) || "null".equals(input) || "[NULL]".equals(input)) {
				score = 0;
			} else {
				LocalDate birthday = LocalDate.parse(input);

				Period p = Period.between(birthday, today);
				score = p.getYears();
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private int findAgeRange(int input) {
		int score = 0;
		try {
			if (input == 0) {
				score = 0;
			} else {
				if (input >= 59 && input <= 65) {
					score = 1;
				} else if (input >= 66 && input <= 70) {
					score = 2;
				} else if (input >= 71) {
					score = 3;
				} else {
					score = 0;
				}
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	private String calTmseGroup(String input) {
		int cal = Integer.parseInt(input);
		String score = "0";
		try {
			if (cal >= 0 && cal <= 17) {
				score = "1";
			} else if (cal >= 18 && cal <= 23) {
				score = "2";
			} else if (cal >= 24 && cal <= 30) {
				score = "3";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String calStsGroup(String input) {
		int cal = Integer.parseInt(input);
		String score = "0";
		try {
			if (cal >= 0 && cal <= 4) {
				score = "1";
			} else if (cal >= 5 && cal <= 7) {
				score = "2";
			} else if (cal >= 8 && cal <= 9) {
				score = "3";
			} else if (cal >= 10 && cal <= 15) {
				score = "4";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String calSection4Group(String input) {
		String score = "0";
		try {
			int cal = Integer.parseInt(input);
			if (cal >= 0 && cal <= 27) {
				score = "1";
			} else if (cal >= 28 && cal <= 36) {
				score = "2";
			} else if (cal >= 37 && cal <= 43) {
				score = "3";
			} else if (cal >= 44 && cal <= 49) {
				score = "4";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String findBmi(String w,String h) {
		try {
			float bmi = 0;
			DecimalFormat df = new DecimalFormat("#.#");
			if(!"".equals(w)&&!"".equals(h)&&!"0".equals(w)&&!"0".equals(h)) {
				float weight = Float.parseFloat(w);
				float height = Float.parseFloat(h);
				bmi = weight/((height/100)*(height/100));
			}
			return df.format(bmi);
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String findWaistlineInch(String waistline) {
		try {
			double toInch = 0;
			DecimalFormat df = new DecimalFormat("#.##");
			if(!"".equals(waistline)&&!"0".equals(waistline)) {
				double waistlineF = Double.parseDouble(waistline);
				toInch = waistlineF * 0.39370;
			}
			return df.format(toInch);
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String findSPS(String input) {
		String score = "0";
		try {
			if (input.indexOf("1") != -1) {
				score = "1";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private int findISS(String input) {
		int count = 0;
		try {
				if (input.indexOf(",") == -1) {
					if (input.indexOf("99") != -1) {
						count = 0;
					} else if (input.indexOf("1") != -1) {
						count = 1;
					} else if (input.indexOf("2") != -1) {
						count = 1;
					} else if (input.indexOf("3") != -1) {
						count = 1;
					} else if (input.indexOf("4") != -1) {
						count = 1;
					} else if (input.indexOf("5") != -1) {
						count = 1;
					} else if (input.indexOf("6") != -1) {
						count = 1;
					} else if (input.indexOf("7") != -1) {
						count = 1;
					} else if (input.indexOf("8") != -1) {
						count = 1;
					} else if (input.indexOf("9") != -1) {
						count = 1;
					} else {
						count =0;
					}
				} else {
					String[] arrayData = input.split(",", -1);
					for (String data : arrayData) {
						if (data.indexOf("9") != -1) {
							count++;
						} else if (data.indexOf("1") != -1) {
							count++;
						} else if (data.indexOf("2") != -1) {
							count++;
						} else if (data.indexOf("3") != -1) {
							count++;
						} else if (data.indexOf("4") != -1) {
							count++;
						} else if (data.indexOf("5") != -1) {
							count++;
						} else if (data.indexOf("6") != -1) {
							count++;
						} else if (data.indexOf("7") != -1) {
							count++;
						} else if (data.indexOf("8") != -1) {
							count++;
						}
					}

				}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	private String spitHelpOrg(String input , String number) {
		String score = "0";
		try {
				if (input.indexOf(number) != -1) {
					score = "1";
				}else {
					score = "0";
				}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private int findScore(String input) {
		int cal = 0;
		try {
			cal = Integer.parseInt(input);
			if(cal == 99) {
				cal = 0;
			}
			return cal;
		} catch (Exception e) {
			e.printStackTrace();
			return cal;
		}
	}
	
	private String spitDiseaseDetail(String input , String number) {
		String score = "0";
		int cal = 0;
		try {
			if (input.indexOf(",") == -1) {
				input = input.replace("[", "");
				input = input.replace("]", "");
				input = input.replace("\"", "");
				if (!"".equals(input)) {
					cal = Integer.parseInt(input);
					if (cal >= 10) {
						if (input.indexOf("10") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("11") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("12") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("99") != -1 && number.equals(input)) {
							score = "0";
						} else {
							score = "0";
						}
					} else {
						if (input.indexOf("1") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("2") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("3") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("4") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("5") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("6") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("7") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("8") != -1 && number.equals(input)) {
							score = "1";
						} else if (input.indexOf("9") != -1 && number.equals(input)) {
							score = "1";
						} else {
							score = "0";
						}
					}
				}
			} else {
				String[] arrayData = input.split(",", -1);
				for (String data : arrayData) {
					data = data.replace("[", "");
					data = data.replace("]", "");
					data = data.replace("\"", "");
					if (!"".equals(input)) {
						cal = Integer.parseInt(data);
						if(number.equals(data)) {
						if (cal >= 10) {
							if (input.indexOf("10") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("11") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("12") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("99") != -1 && number.equals(data)) {
								score = "0";
							} else {
								score = "0";
							}
						} else {
							if (input.indexOf("1") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("2") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("3") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("4") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("5") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("6") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("7") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("8") != -1 && number.equals(data)) {
								score = "1";
							} else if (input.indexOf("9") != -1 && number.equals(data)) {
								score = "1";
							} else {
								score = "0";
							}
						}
						}
					}
				}
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}

	private String calFlagPain(String input) {
		int cal = 0;
		String score = "0";
		try {
			cal = Integer.parseInt(input);
			if(cal >= 0 && cal <= 2) {
				score = "0";
			}else if (cal > 2) {
				score = "1";
			}else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}

	private String calFlagHealth(String input) {
		String score = "0";
		try {
			if("1".equals(input)) {
				score = "1";
			}else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String calHealthScore(int input) {
		String score = "0";
		try {
			if(input==0) {
				score = "0";
			}else {
				score = "1";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}

	private String calHealthStatus(String input) {
		String score = "0";
		try {
			if("0".equals(input)) {
				score = "1";
			}else {
				score = "2";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String findPA(String input) {
		String score = "0";
		try {
			if(input.indexOf("99") != -1) {
				score = "0";
			}else if (input.indexOf("3") != -1 || input.indexOf("4") != -1 || input.indexOf("7") != -1 || input.indexOf("8") != -1 || input.indexOf("9") != -1) {
				score = "1";
			}else { 
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String findCanSee(String input) {
		String score = "0";
		try {
			if("1".equals(input)) {
				score = "0";
			}else if("2".equals(input)||"3".equals(input)||"4".equals(input)) {
				score = "1";
			}else {
				score = "99";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String findSmoke(String mappingCode,DbService dbService) {
		String score = "0";
		try {
			String smoke = dbService.queryTableSmoke(mappingCode);
			if("1".equals(smoke)) {
				score = "0";
			}else if ("2".equals(smoke) || "3".equals(smoke)) {
				score = "1";
			}else if ("4".equals(smoke)) {
				score = "2";
			}else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score = "0";
		}
	}
	
	private String findAlcohol(String mappingCode,DbService dbService) {
		String score = "0";
		try {
			String alcohol = dbService.queryTableAlcohol(mappingCode);
			if("1".equals(alcohol)) {
				score = "0";
			}else if ("2".equals(alcohol) || "3".equals(alcohol)) {
				score = "1";
			}else if ("4".equals(alcohol)) {
				score = "2";
			}else{
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score = "0";
		}
	}
	
	private String findArrayCount (String input) {
		int count = 0;
		try {
			if (input.indexOf(",") == -1) {
				if (input.indexOf("99") != -1) {
					count = 0;
				} else if (input.indexOf("1") != -1) {
					count = 1;
				} else if (input.indexOf("2") != -1) {
					count = 1;
				} else if (input.indexOf("3") != -1) {
					count = 1;
				} else if (input.indexOf("4") != -1) {
					count = 1;
				} else if (input.indexOf("5") != -1) {
					count = 1;
				} else if (input.indexOf("6") != -1) {
					count = 1;
				} else if (input.indexOf("7") != -1) {
					count = 1;
				} else if (input.indexOf("8") != -1) {
					count = 1;
				} else if (input.indexOf("9") != -1) {
					count = 1;
				} else {
					count =0;
				}
			} else {
				String[] arrayData = input.split(",", -1);
				count = arrayData.length;
			}
			return String.valueOf(count);
		} catch (Exception e) {
			e.printStackTrace();
			return String.valueOf(count);
		}
	}
	
	private String findTTW(String input) {
		String score = "0";
		try {
			if (input.indexOf("7") != -1) {
				score = "1";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String findNNJRH(String input) {
		String score = "0";
		try {
			if (input.indexOf("3") != -1) {
				score = "1";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String findWLH(String input) {
		String score = "0";
		try {
			if (input.indexOf("1") != -1) {
				score = "1";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private String findWLS(String input) {
		String score = "0";
		try {
			if (input.indexOf("2") != -1) {
				score = "1";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}
	
	private int findDiseaseTotal(String disease,String diseaseDetail,String mappingCode,DbService dbService) {
		int count = 0;
		try {
			if (disease.indexOf("3") != -1) {
				if (diseaseDetail.indexOf(",") == -1) {
					if (diseaseDetail.indexOf("10") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("11") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("12") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("99") != -1) {
						count = 0;
					} else if (diseaseDetail.indexOf("1") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("2") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("3") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("4") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("5") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("6") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("7") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("8") != -1) {
						count = 1;
					} else if (diseaseDetail.indexOf("9") != -1) {
						count = 1;
					} else {
						count = 0;
					}
				} else {
					String[] arrayData = diseaseDetail.split(",", -1);
					for (String data : arrayData) {
						if (data.indexOf("10") != -1) {
							count++;
						} else if (data.indexOf("11") != -1) {
							count++;
						} else if (data.indexOf("12") != -1) {
							count++;
						} else if (data.indexOf("99") != -1) {
							count++;
						} else if (data.indexOf("1") != -1) {
							count++;
						} else if (data.indexOf("2") != -1) {
							count++;
						} else if (data.indexOf("3") != -1) {
							count++;
						} else if (data.indexOf("4") != -1) {
							count++;
						} else if (data.indexOf("5") != -1) {
							count++;
						} else if (data.indexOf("6") != -1) {
							count++;
						} else if (data.indexOf("7") != -1) {
							count++;
						} else if (data.indexOf("8") != -1) {
							count++;
						} else if (data.indexOf("9") != -1) {
							count++;
						}
					}
				}
			}else if (disease.indexOf("1") != -1) {
				count = 0;
			}else if (disease.indexOf("2") != -1) {
				count = dbService.queryTableHealth(mappingCode);
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	private String calSection4Grade(String input) {
		String score = "0";
		try {
			int cal = Integer.parseInt(input);
			if (cal >= 7 && cal <= 27) {
				score = "1";
			} else if (cal >= 28 && cal <= 43) {
				score = "2";
			} else if (cal >= 44) {
				score = "3";
			} else {
				score = "0";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}

	private String calSPPAdl(String input) {
		String score = "0";
		try {
			if("1B1280".equals(input)) {
				score = "1";
			}else if("1B1281".equals(input)) {
				score = "2";
			}else if("1B1282".equals(input)) {
				score = "3";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}

	private String calSPPFall(String input) {
		String score = "0";
		try {
			if("1B1200".equals(input)) {
				score = "1";
			}else if("1B1201".equals(input)) {
				score = "2";
			}else if("1B1202".equals(input)) {
				score = "3";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String calSPPEye(String input) {
		String score = "0";
		try {
			if("1B1250".equals(input)) {
				score = "0";
			}else if("1B1253".equals(input)) {
				score = "0";
			}else if("1B1256".equals(input)) {
				score = "0";
			}else if("1B1251".equals(input)) {
				score = "1";
			}else if("1B1252".equals(input)) {
				score = "1";
			}else if("1B1254".equals(input)) {
				score = "1";
			}else if("1B1255".equals(input)) {
				score = "1";
			}else if("1B1257".equals(input)) {
				score = "1";
			}else if("1B1258".equals(input)) {
				score = "1";
			}else{
				score = "2";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String changeAreaName(String input) {
		String lable = "";
		try {
			if("1".equals(input)) {
				lable = "Mae Ngoen";
			}else if("2".equals(input)) {
				lable = "Si Song Rak";
			}else if("3".equals(input)) {
				lable = "Si Racha";
			}else if("4".equals(input)) {
				lable = "Tha Phae";
			}
			return lable;
		} catch (Exception e) {
			e.printStackTrace();
			return lable;
		}
	}
	
	private String changeAgeRange(String input) {
		String lable = "";
		try {
			if("1".equals(input)) {
				lable = "60 - 65";
			}else if("2".equals(input)) {
				lable = "66 - 70";
			}else if("3".equals(input)) {
				lable = ">70";
			}else if("0".equals(input)) {
				lable = "0";
			}
			return lable;
		} catch (Exception e) {
			e.printStackTrace();
			return lable;
		}
	}
	
	private String findDiseaseOth(String input , String word) {
		String score = "0";
		try {
			if (input.indexOf(word)  != -1){
				score = "1";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String seeTop3(String input1 , String input2 , String input3) {
		String score = "0";
		try {
			if (input1.equals("1") && input2.equals("1") && input3.equals("1")){
				score = "1";
			}
			return score;
		} catch (Exception e) {
			e.printStackTrace();
			return score;
		}
	}
	
	private String section4GradeToLable(String section4_grade) {
		String lable = "";
		try {
			if ("1".equals(section4_grade)){
				lable = "มีปัญหาในการทำงาน";
			}else if ("2".equals(section4_grade)){
				lable = "สามารถทำงานได้ปานกลาง";
			}else if ("3".equals(section4_grade)){
				lable = "สามารถทำงานได้ดี";
			}
			return lable;
		} catch (Exception e) {
			e.printStackTrace();
			return lable;
		}
	}
	private String genderToLable(String gender) {
		String lable = "";
		try {
			if ("1".equals(gender)){
				lable = "ชาย";
			}else if ("0".equals(gender)){
				lable = "หญิง";
			}
			return lable;
		} catch (Exception e) {
			e.printStackTrace();
			return lable;
		}
	}
	private String careerToLable(String careerFlag) {
		String lable = "";
		try {
			if ("1".equals(careerFlag)){
				lable = "ประกอบอาชีพ";
			}else if ("2".equals(careerFlag)){
				lable = "ไม่ได้ประกอบอาชีพ";
			}
			return lable;
		} catch (Exception e) {
			e.printStackTrace();
			return lable;
		}
	}
	
	private String calCanRun(String canRun) {
		String lable = "0";
		try {
			if ("2".equals(canRun)){
				lable = "1";
			}else if ("1".equals(canRun)){
				lable = "0";
			}
			return lable;
		} catch (Exception e) {
			e.printStackTrace();
			return lable;
		}
	}
	


}
