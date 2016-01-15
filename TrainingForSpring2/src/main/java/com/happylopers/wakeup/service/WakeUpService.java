package com.happylopers.wakeup.service;

import java.util.List;

import com.happylopers.wakeup.domain.WakeUpVO;


public interface WakeUpService {
/*
 * public void regist(BoardVO board) throws Exception;
	public BoardVO read(Integer bno)throws Exception;
	public void modify(BoardVO board)throws Exception;
	public void remove(Integer bno)throws Exception;
	public List<BoardVO> listCriteria(Criteria cri)throws Exception;
	public int listCountCriteria(Criteria cri)throws Exception;
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;
	public List<String> getAttach(Integer bno)throws Exception;	
 */
	public List<WakeUpVO> list() throws Exception;
	public void regist(WakeUpVO vo) throws Exception;
	public void remove(WakeUpVO vo) throws Exception;
	public void modify(String modal_date, String modal_comment, int modal_seq)throws Exception;
}


