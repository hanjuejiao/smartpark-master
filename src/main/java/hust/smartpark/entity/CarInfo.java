package hust.smartpark.entity;

public class CarInfo {
    private String roomNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_info.tel
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_info.remark
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_info.receipt_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    private String receiptNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_info.car_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    private String carNum;

   
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_info.room_num
     *
     * @return the value of car_info.room_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public String getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_info.room_num
     *
     * @param roomNum the value for car_info.room_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_info.tel
     *
     * @return the value of car_info.tel
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_info.tel
     *
     * @param tel the value for car_info.tel
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_info.remark
     *
     * @return the value of car_info.remark
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_info.remark
     *
     * @param remark the value for car_info.remark
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_info.receipt_num
     *
     * @return the value of car_info.receipt_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public String getReceiptNum() {
        return receiptNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_info.receipt_num
     *
     * @param receiptNum the value for car_info.receipt_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public void setReceiptNum(String receiptNum) {
        this.receiptNum = receiptNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_info.car_num
     *
     * @return the value of car_info.car_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public String getCarNum() {
        return carNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_info.car_num
     *
     * @param carNum the value for car_info.car_num
     *
     * @mbggenerated Mon May 15 21:06:51 CST 2017
     */
    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

	@Override
	public String toString() {
		return "CarInfo [ roomNum=" + roomNum + ", tel=" + tel
				+ ", remark=" + remark + ", receiptNum=" + receiptNum
				+ ", carNum=" + carNum + "]";
	}
    
}