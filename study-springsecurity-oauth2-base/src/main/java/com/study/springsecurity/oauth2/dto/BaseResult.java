package com.study.springsecurity.oauth2.dto;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

/**
 * 
 * TODO 包装响应数据
 * 
 * @author fengb
 * @data 2020年5月29日
 *
 */
public class BaseResult implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 响应状态码
	 */
	private int code;
	/**
	 * 响应消息
	 */
	private String msg;
	/**
	 * 响应数据
	 */
	private Object data;

	public BaseResult() {
	}

	public BaseResult(Object data) {
		super();
		this.code = 200;
		this.msg = "OK";
		this.data = data;
	}

	public BaseResult(String msg, Object data) {
		super();
		this.code = 200;
		this.msg = msg;
		this.data = data;
	}

	public BaseResult(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static BaseResult ok() {
		return new BaseResult();
	}

	public static BaseResult ok(String msg) {
		return new BaseResult(msg, null);
	}

	public static BaseResult ok(Object data) {
		return new BaseResult(data);
	}

	public static BaseResult ok(String msg, Object data) {
		return new BaseResult(msg, data);
	}

	public static BaseResult build(int code, String msg) {
		return new BaseResult(code, msg, null);
	}

	public static BaseResult build(int code, String msg, Object data) {
		return new BaseResult(code, msg, data);
	}

	/**
	 * 格式化成json对象
	 * 
	 * @return
	 */
	public String toJsonString() {
		return JSON.toJSONString(this);
	}

	/**
	 * 将json字符串转换成BaseResult对象
	 * 
	 * @param json
	 * @return
	 */
	public static BaseResult parse(String json) {
		BaseResult result = null;
		try {
			result = JSON.parseObject(json, BaseResult.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
}
