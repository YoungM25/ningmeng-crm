package com.ningmeng.common.exception;



/**业务异常
 * @Description:
 * @Author:MaJi
 * @CreatDate:2015年8月6日
 * @Version:V1.0
 */
public class BusinessException extends Exception
{

	private static final long serialVersionUID = -3200845674835962977L;
	
	private String code;
	
	public BusinessException()
	{
		super();
	}
	
	public BusinessException(String message)
	{
		super(message);
	}
	
	public BusinessException(String message, Throwable cause) 
	{
        super(message, cause);
    }
	
	public BusinessException(Throwable cause) 
	{
        super(cause);
    }
	
	public BusinessException(String code, String message)
	{
		super(message);
		this.code = code;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

}

