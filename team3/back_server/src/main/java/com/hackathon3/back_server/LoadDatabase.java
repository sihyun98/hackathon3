package com.hackathon3.back_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.domain.Subscribe;
import com.hackathon3.back_server.encoding.PasswordEncoding;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.repository.StockRepository;
import com.hackathon3.back_server.repository.SubscribeRepository;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(MemberRepository memberRepository, StockRepository stockRepository, SubscribeRepository subscribeRepository) {
		  
//		  MemberRepository memberRepository = ;
//		  StockRepository stockRepository;

	      return args -> {
	    	  
	    	  PasswordEncoding passwordEncoding = new PasswordEncoding();
	    	  
	    	  //Member
	    	  Member member1 = new Member();
	    	  member1.setName("차예린");
	    	  member1.setUsername("koscom1");
	    	  member1.setPassword(passwordEncoding.getSha512("1234"));
	    	  member1.setGrade("LV.1 파개미");
	    	  member1.setAge(28);
	    	  member1.setJob("사무직");
	    	  member1.setInvestOpt("투자주식");
	    	  member1.setSalary(5797);
	    	  member1.setProperty(1316);
	    	  member1.setProfile("나는야 파개미1");
	    	  member1.setTotalEarning(2.45);
	    	  log.info("preloading " + memberRepository.save(member1));
	    	  
	    	  Member member2 = new Member();
	    	  member2.setName("윤하은");
	    	  member2.setUsername("koscom2");
	    	  member2.setPassword(passwordEncoding.getSha512("1234"));
	    	  member2.setGrade("LV.1 파개미");
	    	  member2.setAge(28);
	    	  member2.setJob("전문직");
	    	  member2.setInvestOpt("단타위주");
	    	  member2.setSalary(8097);
	    	  member2.setProperty(1864);
	    	  member2.setProfile("나는야 파개미2");
	    	  member2.setTotalEarning(-0.30);
	    	  log.info("preloading " + memberRepository.save(member2));
	    	  
	    	  Member member3 = new Member();
	    	  member3.setName("안기현");
	    	  member3.setUsername("koscom3");
	    	  member3.setPassword(passwordEncoding.getSha512("1234"));
	    	  member3.setGrade("LV.1 파개미");
	    	  member3.setAge(29);
	    	  member3.setJob("교직");
	    	  member3.setInvestOpt("투자주식");
	    	  member3.setSalary(4351);
	    	  member3.setProperty(1286);
	    	  member3.setProfile("나는야 파개미3");
	    	  member3.setTotalEarning(12.81);
	    	  log.info("preloading " + memberRepository.save(member3));
	    	  
	    	  Member member4 = new Member();
	    	  member4.setName("조태율");
	    	  member4.setUsername("koscom4");
	    	  member4.setPassword(passwordEncoding.getSha512("1234"));
	    	  member4.setGrade("LV.1 파개미");
	    	  member4.setAge(29);
	    	  member4.setJob("관리직");
	    	  member4.setInvestOpt("위험추구");
	    	  member4.setSalary(5135);
	    	  member4.setProperty(1780);
	    	  member4.setProfile("나는야 파개미4");
	    	  member4.setTotalEarning(-36.43);
	    	  log.info("preloading " + memberRepository.save(member4));

	    	  Member member5 = new Member();
	    	  member5.setName("노영록");
	    	  member5.setUsername("koscom5");
	    	  member5.setPassword(passwordEncoding.getSha512("1234"));
	    	  member5.setGrade("LV.1 파개미");
	    	  member5.setAge(27);
	    	  member5.setJob("사무직");
	    	  member5.setInvestOpt("투자주식");
	    	  member5.setSalary(4848);
	    	  member5.setProperty(1800);
	    	  member5.setProfile("나는야 파개미5");
	    	  member5.setTotalEarning(25.00);
	    	  log.info("preloading " + memberRepository.save(member5));

	    	  Member member6 = new Member();
	    	  member6.setName("이예은");
	    	  member6.setUsername("koscom6");
	    	  member6.setPassword(passwordEncoding.getSha512("1234"));
	    	  member6.setGrade("LV.1 파개미");
	    	  member6.setAge(29);
	    	  member6.setJob("자영업");
	    	  member6.setInvestOpt("투자주식");
	    	  member6.setSalary(5900);
	    	  member6.setProperty(1700);
	    	  member6.setProfile("나는야 파개미6");
	    	  member6.setTotalEarning(3.03);
	    	  log.info("preloading " + memberRepository.save(member6));
	    	  
	    	  Member member7 = new Member();
	    	  member7.setName("이영인");
	    	  member7.setUsername("koscom7");
	    	  member7.setPassword(passwordEncoding.getSha512("1234"));
	    	  member7.setGrade("LV.1 파개미");
	    	  member7.setAge(29);
	    	  member7.setJob("판매직");
	    	  member7.setInvestOpt("투자주식");
	    	  member7.setSalary(4228);
	    	  member7.setProperty(1245);
	    	  member7.setProfile("나는야 파개미7");
	    	  member7.setTotalEarning(10.67);
	    	  log.info("preloading " + memberRepository.save(member7));
	    	  
	    	  Member member8 = new Member();
	    	  member8.setName("박용수");
	    	  member8.setUsername("koscom8");
	    	  member8.setPassword(passwordEncoding.getSha512("1234"));
	    	  member8.setGrade("LV.1 파개미");
	    	  member8.setAge(28);
	    	  member8.setJob("서비스직");
	    	  member8.setInvestOpt("위험은조금만");
	    	  member8.setSalary(6581);
	    	  member8.setProperty(1629);
	    	  member8.setProfile("나는야 파개미8");
	    	  member8.setTotalEarning(10.07);
	    	  log.info("preloading " + memberRepository.save(member8));
	    	  
	    	  Member member9 = new Member();
	    	  member9.setName("김태현");
	    	  member9.setUsername("koscom9");
	    	  member9.setPassword(passwordEncoding.getSha512("1234"));
	    	  member9.setGrade("LV.1 파개미");
	    	  member9.setAge(22);
	    	  member9.setJob("학생");
	    	  member9.setInvestOpt("위험추구");
	    	  member9.setSalary(0);
	    	  member9.setProperty(89);
	    	  member9.setProfile("나는야 파개미9");
	    	  member9.setTotalEarning(-20.54);
	    	  log.info("preloading " + memberRepository.save(member9));
	    	  
	    	  Member member10 = new Member();
	    	  member10.setName("김수아");
	    	  member10.setUsername("koscom10");
	    	  member10.setPassword(passwordEncoding.getSha512("1234"));
	    	  member10.setGrade("LV.1 파개미");
	    	  member10.setAge(29);
	    	  member10.setJob("전문직");
	    	  member10.setInvestOpt("투자주식");
	    	  member10.setSalary(7767);
	    	  member10.setProperty(692);
	    	  member10.setProfile("나는야 파개미10");
	    	  member10.setTotalEarning(12.50);
	    	  log.info("preloading " + memberRepository.save(member10));
			

	    	  Member member11 = new Member();
	    	  member11.setName("윤성수");
	    	  member11.setUsername("koscom11");
	    	  member11.setPassword(passwordEncoding.getSha512("1234"));
	    	  member11.setGrade("LV.2 초개미");
	    	  member11.setAge(34);
	    	  member11.setJob("자영업");
	    	  member11.setInvestOpt("투자주식");
	    	  member11.setSalary(7126);
	    	  member11.setProperty(11300);
	    	  member11.setProfile("나는야 초개미1");
	    	  member11.setTotalEarning(32.94);
	    	  log.info("preloading " + memberRepository.save(member11));

	    	  Member member12 = new Member();
	    	  member12.setName("박창재");
	    	  member12.setUsername("koscom12");
	    	  member12.setPassword(passwordEncoding.getSha512("1234"));
	    	  member12.setGrade("LV.2 초개미");
	    	  member12.setAge(32);
	    	  member12.setJob("전문직");
	    	  member12.setInvestOpt("위험추구");
	    	  member12.setSalary(7087);
	    	  member12.setProperty(3287);
	    	  member12.setProfile("나는야 초개미2");
	    	  member12.setTotalEarning(41.79);
	    	  log.info("preloading " + memberRepository.save(member12));

	    	  Member member13 = new Member();
	    	  member13.setName("박선영");
	    	  member13.setUsername("koscom13");
	    	  member13.setPassword(passwordEncoding.getSha512("1234"));
	    	  member13.setGrade("LV.2 초개미");
	    	  member13.setAge(30);
	    	  member13.setJob("서비스직");
	    	  member13.setInvestOpt("투자주식");
	    	  member13.setSalary(4870);
	    	  member13.setProperty(5348);
	    	  member13.setProfile("나는야 초개미3");
	    	  member13.setTotalEarning(11.93);
			  log.info("preloading " + memberRepository.save(member13));

	    	  Member member14 = new Member();
	    	  member14.setName("정유리");
	    	  member14.setUsername("koscom14");
	    	  member14.setPassword(passwordEncoding.getSha512("1234"));
	    	  member14.setGrade("LV.2 초개미");
	    	  member14.setAge(28);
	    	  member14.setJob("자영업");
	    	  member14.setInvestOpt("위험추구");
	    	  member14.setSalary(4740);
	    	  member14.setProperty(6034);
	    	  member14.setProfile("나는야 초개미4");
	    	  member14.setTotalEarning(62.76);
	    	  log.info("preloading " + memberRepository.save(member14));

	    	  Member member15 = new Member();
	    	  member15.setName("김동식");
	    	  member15.setUsername("koscom15");
	    	  member15.setPassword(passwordEncoding.getSha512("1234"));
	    	  member15.setGrade("LV.2 초개미");
	    	  member15.setAge(35);
	    	  member15.setJob("전문직");
	    	  member15.setInvestOpt("위험은조금만");
	    	  member15.setSalary(7545);
	    	  member15.setProperty(4280);
	    	  member15.setProfile("나는야 초개미5");
	    	  member15.setTotalEarning(94.55);
	    	  log.info("preloading " + memberRepository.save(member15));

	    	  Member member16 = new Member();
	    	  member16.setName("노민우");
	    	  member16.setUsername("koscom16");
	    	  member16.setPassword(passwordEncoding.getSha512("1234"));
	    	  member16.setGrade("LV.3 노개미");
	    	  member16.setAge(35);
	    	  member16.setJob("서비스직");
	    	  member16.setInvestOpt("단타위주");
	    	  member16.setSalary(3635);
	    	  member16.setProperty(22600);
	    	  member16.setProfile("나는야 노개미1");
	    	  member16.setTotalEarning(16.02);
	    	  log.info("preloading " + memberRepository.save(member16));

	    	  Member member17 = new Member();
	    	  member17.setName("장혜민");
	    	  member17.setUsername("koscom17");
	    	  member17.setPassword(passwordEncoding.getSha512("1234"));
	    	  member17.setGrade("LV.3 노개미");
	    	  member17.setAge(31);
	    	  member17.setJob("전문직");
	    	  member17.setInvestOpt("투자주식");
	    	  member17.setSalary(6574);
	    	  member17.setProperty(7630);
	    	  member17.setProfile("나는야 노개미2");
	    	  member17.setTotalEarning(87.47);
	    	  log.info("preloading " + memberRepository.save(member17));

	    	  Member member18 = new Member();
	    	  member18.setName("정규동");
	    	  member18.setUsername("koscom18");
	    	  member18.setPassword(passwordEncoding.getSha512("1234"));
	    	  member18.setGrade("LV.4 빨개미");
	    	  member18.setAge(32);
	    	  member18.setJob("서비스직");
	    	  member18.setInvestOpt("위험은조금만");
	    	  member18.setSalary(3750);
	    	  member18.setProperty(12856);
	    	  member18.setProfile("나는야 빨개미");
	    	  member18.setTotalEarning(70.73);
	    	  log.info("preloading " + memberRepository.save(member18));


	    	  // Stock
	    	  
	    	  //회원1
	    	  Stock stock1_1 = new Stock();
	    	  stock1_1.setBalanceNo("123456789");
	    	  stock1_1.setMember(member1);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock1_1.setFirmNm("NH투자증권");
	    	  stock1_1.setStockNm("삼성전자");
	    	  stock1_1.setQty(40);
	    	  stock1_1.setValTrade(60000);
	    	  stock1_1.setValCur(90000);
	    	  stock1_1.setAssertType("주식");
	    	  stock1_1.setIsuSrtCd("005930");
	    	  stock1_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock1_1));
	    	  
	    	  Stock stock1_2 = new Stock();
	    	  stock1_2.setBalanceNo("123456789");
	    	  stock1_2.setMember(member1);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock1_2.setFirmNm("NH투자증권");
	    	  stock1_2.setStockNm("호텔신라");
	    	  stock1_2.setQty(10);
	    	  stock1_2.setValTrade(90000);
	    	  stock1_2.setValCur(83000);
	    	  stock1_2.setAssertType("주식");
	    	  stock1_2.setIsuSrtCd("008770");
	    	  stock1_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock1_2));
	    	  
	    	  Stock stock1_3 = new Stock();
	    	  stock1_3.setBalanceNo("123456789");
	    	  stock1_3.setMember(member1);
//	    	  stock1_3.setMemberId(member1.getId());
	    	  stock1_3.setFirmNm("NH투자증권");
	    	  stock1_3.setStockNm("NAVER");
	    	  stock1_3.setQty(8);
	    	  stock1_3.setValTrade(310000);
	    	  stock1_3.setValCur(340000);
	    	  stock1_3.setAssertType("주식");
	    	  stock1_3.setIsuSrtCd("035420");
	    	  stock1_3.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock1_3));
	    	  
	    	  Stock stock1_4 = new Stock();
	    	  stock1_4.setBalanceNo("123456789");
	    	  stock1_4.setMember(member1);
//	    	  stock1_4.setMemberId(member1.getId());
	    	  stock1_4.setFirmNm("NH투자증권");
	    	  stock1_4.setStockNm("카카오");
	    	  stock1_4.setQty(5);
	    	  stock1_4.setValTrade(350000);
	    	  stock1_4.setValCur(450000);
	    	  stock1_4.setAssertType("주식");
	    	  stock1_4.setIsuSrtCd("035720");
	    	  stock1_4.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock1_4));
	    	  
	    	  Stock stock1_5 = new Stock();
	    	  stock1_5.setBalanceNo("123456789");
	    	  stock1_5.setMember(member1);
//	    	  stock1_5.setMemberId(member1.getId());
	    	  stock1_5.setFirmNm("NH투자증권");
	    	  stock1_5.setStockNm("빅히트");
	    	  stock1_5.setQty(3);
	    	  stock1_5.setValTrade(182000);
	    	  stock1_5.setValCur(207000);
	    	  stock1_5.setAssertType("주식");
	    	  stock1_5.setIsuSrtCd("352820");
	    	  stock1_5.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock1_5));
	    	  
	    	  Stock stock1_6 = new Stock();
	    	  stock1_6.setBalanceNo("123456789");
	    	  stock1_6.setMember(member1);
//	    	  stock1_5.setMemberId(member1.getId());
	    	  stock1_6.setFirmNm("NH투자증권");
	    	  stock1_6.setStockNm("NH-Amundi코리아2배레버리지증권투자");
	    	  stock1_6.setQty(1);
	    	  stock1_6.setValTrade(3000000);
	    	  stock1_6.setValCur(3240000);
	    	  stock1_6.setAssertType("펀드");
	    	  stock1_6.setIsuSrtCd("");
	    	  stock1_6.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock1_6));
	    	  
	    	  Stock stock1_7 = new Stock();
	    	  stock1_7.setBalanceNo("123456789");
	    	  stock1_7.setMember(member1);
//	    	  stock1_5.setMemberId(member1.getId());
	    	  stock1_7.setFirmNm("");
	    	  stock1_7.setStockNm("Bitcoin");
	    	  stock1_7.setQty(1);
	    	  stock1_7.setValTrade(2120000);
	    	  stock1_7.setValCur(1540000);
	    	  stock1_7.setAssertType("암호화폐");
	    	  stock1_7.setIsuSrtCd("");
	    	  stock1_7.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock1_7));
	    	  
	    	  
	    	  //회원2
	    	  Stock stock2_1 = new Stock();
	    	  stock2_1.setBalanceNo("12341234");
	    	  stock2_1.setMember(member2);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock2_1.setFirmNm("키움증권");
	    	  stock2_1.setStockNm("삼성SDI");
	    	  stock2_1.setQty(2);
	    	  stock2_1.setValTrade(780000);
	    	  stock2_1.setValCur(789000);
	    	  stock2_1.setAssertType("주식");
	    	  stock2_1.setIsuSrtCd("006400");
	    	  stock2_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock2_1));
	    	  
	    	  Stock stock2_2 = new Stock();
	    	  stock2_2.setBalanceNo("12341234");
	    	  stock2_2.setMember(member2);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock2_2.setFirmNm("키움증권");
	    	  stock2_2.setStockNm("SK바이오팜");
	    	  stock2_2.setQty(5);
	    	  stock2_2.setValTrade(150000);
	    	  stock2_2.setValCur(149500);
	    	  stock2_2.setAssertType("주식");
	    	  stock2_2.setIsuSrtCd("326030");
	    	  stock2_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock2_2));

	    	  Stock stock2_3 = new Stock();
	    	  stock2_3.setBalanceNo("12341234");
	    	  stock2_3.setMember(member2);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock2_3.setFirmNm("키움증권");
	    	  stock2_3.setStockNm("아시아나항공");
	    	  stock2_3.setQty(60);
	    	  stock2_3.setValTrade(16000);
	    	  stock2_3.setValCur(15500);
	    	  stock2_3.setAssertType("주식");
	    	  stock2_3.setIsuSrtCd("020560");
	    	  stock2_3.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock2_3));
	    	  
	    	  Stock stock2_4 = new Stock();
	    	  stock2_4.setBalanceNo("12341234");
	    	  stock2_4.setMember(member2);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock2_4.setFirmNm("키움증권");
	    	  stock2_4.setStockNm("NAVER");
	    	  stock2_4.setQty(2);
	    	  stock2_4.setValTrade(335000);
	    	  stock2_4.setValCur(340000);
	    	  stock2_4.setAssertType("주식");
	    	  stock2_4.setIsuSrtCd("035420");
	    	  stock2_4.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock2_4));
	    	  
	    	  Stock stock2_5 = new Stock();
	    	  stock2_5.setBalanceNo("12341234");
	    	  stock2_5.setMember(member2);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock2_5.setFirmNm("키움증권");
	    	  stock2_5.setStockNm("신풍제약");
	    	  stock2_5.setQty(3);
	    	  stock2_5.setValTrade(160000);
	    	  stock2_5.setValCur(89000);
	    	  stock2_5.setAssertType("주식");
	    	  stock2_5.setIsuSrtCd("019170");
	    	  stock2_5.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock2_5));
	    	  
	    	  
	    	  //회원3
	    	  Stock stock3_1 = new Stock();
	    	  stock3_1.setBalanceNo("3312341234");
	    	  stock3_1.setMember(member3);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock3_1.setFirmNm("삼성증권");
	    	  stock3_1.setStockNm("호텔신라");
	    	  stock3_1.setQty(100);
	    	  stock3_1.setValTrade(78000);
	    	  stock3_1.setValCur(83000);
	    	  stock3_1.setAssertType("주식");
	    	  stock3_1.setIsuSrtCd("008770");
	    	  stock3_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock3_1));
	    	  
	    	  Stock stock3_2 = new Stock();
	    	  stock3_2.setBalanceNo("3312341234");
	    	  stock3_2.setMember(member3);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock3_2.setFirmNm("삼성증권");
	    	  stock3_2.setStockNm("대한항공");
	    	  stock3_2.setQty(150);
	    	  stock3_2.setValTrade(24000);
	    	  stock3_2.setValCur(30400);
	    	  stock3_2.setAssertType("주식");
	    	  stock3_2.setIsuSrtCd("003490");
	    	  stock3_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock3_2));
	    	  
	    	  
	    	  //회원4
	    	  Stock stock4_1 = new Stock();
	    	  stock4_1.setBalanceNo("4412341234");
	    	  stock4_1.setMember(member4);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock4_1.setFirmNm("키움증권");
	    	  stock4_1.setStockNm("신풍제약");
	    	  stock4_1.setQty(200);
	    	  stock4_1.setValTrade(140000);
	    	  stock4_1.setValCur(89000);
	    	  stock4_1.setAssertType("주식");
	    	  stock4_1.setIsuSrtCd("019170");
	    	  stock4_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock4_1));
	    	  
	    	  
	    	  //회원5
	    	  Stock stock5_1 = new Stock();
	    	  stock5_1.setBalanceNo("5512341234");
	    	  stock5_1.setMember(member5);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock5_1.setFirmNm("NH투자증권");
	    	  stock5_1.setStockNm("카카오");
	    	  stock5_1.setQty(40);
	    	  stock5_1.setValTrade(360000);
	    	  stock5_1.setValCur(450000);
	    	  stock5_1.setAssertType("주식");
	    	  stock5_1.setIsuSrtCd("035720");
	    	  stock5_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock5_1));
	    	  
	    	  //회원6
	    	  Stock stock6_1 = new Stock();
	    	  stock6_1.setBalanceNo("6612341234");
	    	  stock6_1.setMember(member6);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock6_1.setFirmNm("NH투자증권");
	    	  stock6_1.setStockNm("NAVER");
	    	  stock6_1.setQty(50);
	    	  stock6_1.setValTrade(330000);
	    	  stock6_1.setValCur(340000);
	    	  stock6_1.setAssertType("주식");
	    	  stock6_1.setIsuSrtCd("035420");
	    	  stock6_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock6_1));
	    	  
	    	  //회원7
	    	  Stock stock7_1 = new Stock();
	    	  stock7_1.setBalanceNo("7712341234");
	    	  stock7_1.setMember(member7);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock7_1.setFirmNm("NH투자증권");
	    	  stock7_1.setStockNm("호텔신라");
	    	  stock7_1.setQty(150);
	    	  stock7_1.setValTrade(75000);
	    	  stock7_1.setValCur(83000);
	    	  stock7_1.setAssertType("주식");
	    	  stock7_1.setIsuSrtCd("008770");
	    	  stock7_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock7_1));
	    	  
	    	  //회원8
	    	  Stock stock8_1 = new Stock();
	    	  stock8_1.setBalanceNo("8812341234");
	    	  stock8_1.setMember(member8);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock8_1.setFirmNm("삼성증권");
	    	  stock8_1.setStockNm("삼성전자");
	    	  stock8_1.setQty(100);
	    	  stock8_1.setValTrade(78000);
	    	  stock8_1.setValCur(85600);
	    	  stock8_1.setAssertType("주식");
	    	  stock8_1.setIsuSrtCd("005930");
	    	  stock8_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock8_1));
	    	  
	    	  Stock stock8_2 = new Stock();
	    	  stock8_2.setBalanceNo("8812341234");
	    	  stock8_2.setMember(member8);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock8_2.setFirmNm("삼성증권");
	    	  stock8_2.setStockNm("삼성전자우");
	    	  stock8_2.setQty(100);
	    	  stock8_2.setValTrade(70000);
	    	  stock8_2.setValCur(77300);
	    	  stock8_2.setAssertType("주식");
	    	  stock8_2.setIsuSrtCd("005935");
	    	  stock8_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock8_2));
	    	  
	    	  
	    	  //회원9
	    	  Stock stock9_1 = new Stock();
	    	  stock9_1.setBalanceNo("9912341234");
	    	  stock9_1.setMember(member9);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock9_1.setFirmNm("키움증권");
	    	  stock9_1.setStockNm("신풍제약");
	    	  stock9_1.setQty(10);
	    	  stock9_1.setValTrade(112000);
	    	  stock9_1.setValCur(89000);
	    	  stock9_1.setAssertType("주식");
	    	  stock9_1.setIsuSrtCd("019170");
	    	  stock9_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock9_1));
	    	  
	    	  //회원10
	    	  Stock stock10_1 = new Stock();
	    	  stock10_1.setBalanceNo("1012341234");
	    	  stock10_1.setMember(member10);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock10_1.setFirmNm("NH투자증권");
	    	  stock10_1.setStockNm("두산퓨얼셀");
	    	  stock10_1.setQty(200);
	    	  stock10_1.setValTrade(54400);
	    	  stock10_1.setValCur(61200);
	    	  stock10_1.setAssertType("주식");
	    	  stock10_1.setIsuSrtCd("336260");
	    	  stock10_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock10_1));
	    	  
	    	  
	    	  //회원11
	    	  Stock stock11_1 = new Stock();
	    	  stock11_1.setBalanceNo("1112341234");
	    	  stock11_1.setMember(member11);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock11_1.setFirmNm("삼성증권");
	    	  stock11_1.setStockNm("카카오");
	    	  stock11_1.setQty(100);
	    	  stock11_1.setValTrade(340000);
	    	  stock11_1.setValCur(450000);
	    	  stock11_1.setAssertType("주식");
	    	  stock11_1.setIsuSrtCd("035720");
	    	  stock11_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock11_1));
	    	  
	    	  Stock stock11_2 = new Stock();
	    	  stock11_2.setBalanceNo("1112341234");
	    	  stock11_2.setMember(member11);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock11_2.setFirmNm("삼성증권");
	    	  stock11_2.setStockNm("NAVER");
	    	  stock11_2.setQty(200);
	    	  stock11_2.setValTrade(260000);
	    	  stock11_2.setValCur(340000);
	    	  stock11_2.setAssertType("주식");
	    	  stock11_2.setIsuSrtCd("035420");
	    	  stock11_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock11_2));
	    	  
	    	  
	    	  //회원12
	    	  Stock stock12_1 = new Stock();
	    	  stock12_1.setBalanceNo("1212341234");
	    	  stock12_1.setMember(member12);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock12_1.setFirmNm("키움증권");
	    	  stock12_1.setStockNm("일양약품");
	    	  stock12_1.setQty(1000);
	    	  stock12_1.setValTrade(35500);
	    	  stock12_1.setValCur(51300);
	    	  stock12_1.setAssertType("주식");
	    	  stock12_1.setIsuSrtCd("007570");
	    	  stock12_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock12_1));
	    	  
	    	  Stock stock12_2 = new Stock();
	    	  stock12_2.setBalanceNo("1212341234");
	    	  stock12_2.setMember(member12);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock12_2.setFirmNm("키움증권");
	    	  stock12_2.setStockNm("카카오");
	    	  stock12_2.setQty(30);
	    	  stock12_2.setValTrade(340000);
	    	  stock12_2.setValCur(450000);
	    	  stock12_2.setAssertType("주식");
	    	  stock12_2.setIsuSrtCd("035720");
	    	  stock12_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock12_2));
	    	  
	    	  
	    	  //회원13
	    	  Stock stock13_1 = new Stock();
	    	  stock13_1.setBalanceNo("1312341234");
	    	  stock13_1.setMember(member13);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock13_1.setFirmNm("삼성증권");
	    	  stock13_1.setStockNm("NAVER");
	    	  stock13_1.setQty(500);
	    	  stock13_1.setValTrade(310000);
	    	  stock13_1.setValCur(340000);
	    	  stock13_1.setAssertType("주식");
	    	  stock13_1.setIsuSrtCd("007570");
	    	  stock13_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock13_1));
	    	  
	    	  Stock stock13_2 = new Stock();
	    	  stock13_2.setBalanceNo("1312341234");
	    	  stock13_2.setMember(member13);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock13_2.setFirmNm("삼성증권");
	    	  stock13_2.setStockNm("현대에너지솔루션");
	    	  stock13_2.setQty(400);
	    	  stock13_2.setValTrade(31200);
	    	  stock13_2.setValCur(39900);
	    	  stock13_2.setAssertType("주식");
	    	  stock13_2.setIsuSrtCd("035420");
	    	  stock13_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock13_2));
	    	  
	    	  Stock stock13_3 = new Stock();
	    	  stock13_3.setBalanceNo("1312341234");
	    	  stock13_3.setMember(member13);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock13_3.setFirmNm("삼성증권");
	    	  stock13_3.setStockNm("두산퓨얼셀");
	    	  stock13_3.setQty(500);
	    	  stock13_3.setValTrade(52000);
	    	  stock13_3.setValCur(61200);
	    	  stock13_3.setAssertType("주식");
	    	  stock13_3.setIsuSrtCd("336260");
	    	  stock13_3.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock13_3));
	    	  
	    	  
	    	  //회원14
	    	  Stock stock14_1 = new Stock();
	    	  stock14_1.setBalanceNo("1412341234");
	    	  stock14_1.setMember(member14);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock14_1.setFirmNm("NH투자증권");
	    	  stock14_1.setStockNm("일양약품");
	    	  stock14_1.setQty(500);
	    	  stock14_1.setValTrade(56000);
	    	  stock14_1.setValCur(52600);
	    	  stock14_1.setAssertType("주식");
	    	  stock14_1.setIsuSrtCd("007570");
	    	  stock14_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock14_1));
	    	  
	    	  Stock stock14_2 = new Stock();
	    	  stock14_2.setBalanceNo("1412341234");
	    	  stock14_2.setMember(member14);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock14_2.setFirmNm("NH투자증권");
	    	  stock14_2.setStockNm("신풍제약");
	    	  stock14_2.setQty(500);
	    	  stock14_2.setValTrade(31000);
	    	  stock14_2.setValCur(89000);
	    	  stock14_2.setAssertType("주식");
	    	  stock14_2.setIsuSrtCd("019170");
	    	  stock14_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock14_2));
	    	  
	    	  
	    	  //회원15
	    	  Stock stock15_1 = new Stock();
	    	  stock15_1.setBalanceNo("1512341234");
	    	  stock15_1.setMember(member15);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock15_1.setFirmNm("삼성증권");
	    	  stock15_1.setStockNm("삼성전자");
	    	  stock15_1.setQty(500);
	    	  stock15_1.setValTrade(44000);
	    	  stock15_1.setValCur(85600);
	    	  stock15_1.setAssertType("주식");
	    	  stock15_1.setIsuSrtCd("007570");
	    	  stock15_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock15_1));
	    	  
	    	  
	    	  //회원16
	    	  Stock stock16_1 = new Stock();
	    	  stock16_1.setBalanceNo("1612341234");
	    	  stock16_1.setMember(member16);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock16_1.setFirmNm("키움증권");
	    	  stock16_1.setStockNm("대한항공");
	    	  stock16_1.setQty(2000);
	    	  stock16_1.setValTrade(27000);
	    	  stock16_1.setValCur(30400);
	    	  stock16_1.setAssertType("주식");
	    	  stock16_1.setIsuSrtCd("003490");
	    	  stock16_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock16_1));
	    	  
	    	  Stock stock16_2 = new Stock();
	    	  stock16_2.setBalanceNo("1612341234");
	    	  stock16_2.setMember(member16);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock16_2.setFirmNm("키움증권");
	    	  stock16_2.setStockNm("대한항공우");
	    	  stock16_2.setQty(2000);
	    	  stock16_2.setValTrade(35500);
	    	  stock16_2.setValCur(44850);
	    	  stock16_2.setAssertType("주식");
	    	  stock16_2.setIsuSrtCd("003495");
	    	  stock16_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock16_2));
	    	  
	    	  Stock stock16_3 = new Stock();
	    	  stock16_3.setBalanceNo("1612341234");
	    	  stock16_3.setMember(member16);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock16_3.setFirmNm("키움증권");
	    	  stock16_3.setStockNm("삼성전자");
	    	  stock16_3.setQty(500);
	    	  stock16_3.setValTrade(91000);
	    	  stock16_3.setValCur(85600);
	    	  stock16_3.setAssertType("주식");
	    	  stock16_3.setIsuSrtCd("005930");
	    	  stock16_3.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock16_3));
	    	  
	    	  Stock stock16_4 = new Stock();
	    	  stock16_4.setBalanceNo("1612341234");
	    	  stock16_4.setMember(member16);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock16_4.setFirmNm("키움증권");
	    	  stock16_4.setStockNm("금호석유우");
	    	  stock16_4.setQty(300);
	    	  stock16_4.setValTrade(81000);
	    	  stock16_4.setValCur(109000);
	    	  stock16_4.setAssertType("주식");
	    	  stock16_4.setIsuSrtCd("011785");
	    	  stock16_4.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock16_4));
	    	  
	    	  
	    	  //회원17
	    	  Stock stock17_1 = new Stock();
	    	  stock17_1.setBalanceNo("1712341234");
	    	  stock17_1.setMember(member17);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock17_1.setFirmNm("NH투자증권");
	    	  stock17_1.setStockNm("대한항공");
	    	  stock17_1.setQty(2000);
	    	  stock17_1.setValTrade(14900);
	    	  stock17_1.setValCur(30400);
	    	  stock17_1.setAssertType("주식");
	    	  stock17_1.setIsuSrtCd("003490");
	    	  stock17_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock17_1));
	    	  
	    	  Stock stock17_2 = new Stock();
	    	  stock17_2.setBalanceNo("1712341234");
	    	  stock17_2.setMember(member17);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock17_2.setFirmNm("NH투자증권");
	    	  stock17_2.setStockNm("아시아나항공");
	    	  stock17_2.setQty(1000);
	    	  stock17_2.setValTrade(10900);
	    	  stock17_2.setValCur(15500);
	    	  stock17_2.setAssertType("주식");
	    	  stock17_2.setIsuSrtCd("020560");
	    	  stock17_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock17_2));
	    	  
	    	  
	    	  //회원18
	    	  Stock stock18_1 = new Stock();
	    	  stock18_1.setBalanceNo("1812341234");
	    	  stock18_1.setMember(member18);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock18_1.setFirmNm("삼성증권");
	    	  stock18_1.setStockNm("삼성전자");
	    	  stock18_1.setQty(600);
	    	  stock18_1.setValTrade(48000);
	    	  stock18_1.setValCur(85600);
	    	  stock18_1.setAssertType("주식");
	    	  stock18_1.setIsuSrtCd("005930");
	    	  stock18_1.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock18_1));
	    	  
	    	  Stock stock18_2 = new Stock();
	    	  stock18_2.setBalanceNo("1812341234");
	    	  stock18_2.setMember(member18);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock18_2.setFirmNm("삼성증권");
	    	  stock18_2.setStockNm("삼성전자우");
	    	  stock18_2.setQty(500);
	    	  stock18_2.setValTrade(49200);
	    	  stock18_2.setValCur(77300);
	    	  stock18_2.setAssertType("주식");
	    	  stock18_2.setIsuSrtCd("005935");
	    	  stock18_2.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock18_2));
	    	  
	    	  Stock stock18_3 = new Stock();
	    	  stock18_3.setBalanceNo("1812341234");
	    	  stock18_3.setMember(member18);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock18_3.setFirmNm("삼성증권");
	    	  stock18_3.setStockNm("SK하이닉스");
	    	  stock18_3.setQty(300);
	    	  stock18_3.setValTrade(73000);
	    	  stock18_3.setValCur(128500);
	    	  stock18_3.setAssertType("주식");
	    	  stock18_3.setIsuSrtCd("000660");
	    	  stock18_3.setIsuKorNm("");
	    	  log.info("Preloading " + stockRepository.save(stock18_3));
	    	  
	    	  
	    	  
	    	  Subscribe subscribe1_1 = new Subscribe();
	    	  subscribe1_1.setMy_id(Long.valueOf(1));
	    	  subscribe1_1.setSubscriber_id(Long.valueOf(2));
	    	  log.info("Preloading " + subscribeRepository.save(subscribe1_1));
	    	  
	      };
	  }
}
