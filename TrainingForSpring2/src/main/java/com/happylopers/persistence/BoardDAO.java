package com.happylopers.persistence;

import java.util.List;

import com.happylopers.domain.BoardVO;
import com.happylopers.domain.Criteria;
import com.happylopers.domain.SearchCriteria;


public interface BoardDAO {
    public void create(BoardVO vo)throws Exception;
    public BoardVO read(Integer bno)throws Exception;
    public void update(BoardVO vo)throws Exception;
    public void delete(Integer bno)throws Exception;
    public List<BoardVO> listPage(int page)throws Exception;
    public List<BoardVO> listCriteria(Criteria cri)throws Exception;
    public int countPaging(Criteria cri)throws Exception;
    
    //검색관련추가
    public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
    public int listSearchCount(SearchCriteria cri) throws Exception;
    //public List<BoardVO> listALL()throws Exception;
}
