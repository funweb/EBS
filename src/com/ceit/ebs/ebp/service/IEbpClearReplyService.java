package com.ceit.ebs.ebp.service;

import com.ceit.common.util.PageInfo;
import com.ceit.ebs.ebp.vo.EbpClearReplyVo;

public interface IEbpClearReplyService {
	
	//获得数据的条数
	public Integer getCount();
	
	//通过页数和页面大小获得Vo
	public PageInfo<EbpClearReplyVo> querydata(int pageindex, int pagesize);
	
	//通过ID获得Vo
	public EbpClearReplyVo getEbpClearReplybyId(Integer EbpClearReplyId);
	
	//通过Vo修改数据库
	public boolean modifyEbpClearReply(EbpClearReplyVo EbpClearReplyVo);
	
	//通过ID删除一条数据
	public boolean deleteEbpClearReplybyId(Integer EbpClearReplyId);
	
	//以Vo作为参数插入一条数据
	public Integer insertEbpClearReply(EbpClearReplyVo EbpClearReplyVo);

}
