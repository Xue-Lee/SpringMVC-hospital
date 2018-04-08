package com.icss.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.dao.ClinicDao;
import com.icss.dao.DoctorDao;
import com.icss.dao.MedicalCardDao;
import com.icss.entity.Clinic;
import com.icss.entity.Doctor;
import com.icss.entity.MedicalCard;

@Controller
public class MyController {
	@RequestMapping("login")
	public String login(HttpSession session,MedicalCard card) throws IOException {
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		MedicalCardDao dao = sqlSession.getMapper(MedicalCardDao.class);
		card = dao.findMedicalCardAll(card);
		if(card != null) {
			session.setAttribute("card", card);
			return "redirect:cardMain.do";
		}else {
			return "login";
		}	
	}
	
	@RequestMapping("cardMain")
	public String fun3(HttpServletRequest request) throws IOException{
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		DoctorDao dao= sqlSession.getMapper(DoctorDao.class);
		List<Doctor> dlist = dao.findDoctorAll();
		request.setAttribute("docList", dlist);
		return "cardMain";	
	}
	
	@RequestMapping("cardLogin")
	public String cardLogin(Clinic clinic) throws IOException {
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		ClinicDao dao= sqlSession.getMapper(ClinicDao.class);
		dao.add(clinic);
		sqlSession.commit();
		return "redirect:clinicShowOrder.do";
	}
	
	
	@RequestMapping("clinicShowOrder")
	public String fun5(HttpServletRequest request) throws ParseException, IOException{
		System.out.println("clinic show order----------------------");
		InputStream ins = Resources.getResourceAsStream("mybatis-cfg.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(ins);
		SqlSession sqlSession = sf.openSession();
		ClinicDao dao= sqlSession.getMapper(ClinicDao.class);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		Date dt = sdf.parse(sdf.format(new Date()));
		Timestamp clinicTime=new Timestamp(dt.getTime());
		List<Clinic> clist = dao.findClinicOrder(clinicTime);
		request.setAttribute("clinicList", clist);
		return "clinicShowOrder";
		
	}
}
