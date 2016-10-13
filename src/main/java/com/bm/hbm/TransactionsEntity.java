package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "transactions", schema = "", catalog = "brain")
public class TransactionsEntity {
    private int transactionsId;
    private String transactionsChCode;
    private String transactionsChMobile;
    private Integer transactionsChId;
    private Integer transactionsChTypeId;
    private Integer transactionsInterfaceId;
    private Integer transactionsParentId;
    private Integer transactionsChRecipCode;
    private Integer transactionsChRecipMobile;
    private Integer transactionsChRecipChId;
    private Integer transactionsChRecipChTypeId;
    private Integer transactionsWalletId;
    private Integer transactionsRecipWalletId;
    private BigDecimal transactionsPreBal;
    private BigDecimal transactionsPostBal;
    private BigDecimal transactionsRecipPreBal;
    private BigDecimal transactionsRecipPostBal;
    private Integer transactionsTransactionId;
    private Integer transactionsTransTypeId;
    private String transactionsTransTypeCode;
    private Integer transactionsRefId;
    private String transactionsAgentTransId;
    private BigDecimal transactionsValue;
    private String transactionsSiCode;
    private String transactionsSiResultCode;
    private String transactionsSiResultDesc;
    private String transactionsResultCode;
    private String transactionsResultDesc;
    private String transactionsIp;
    private String transactionsOs;
    private BigDecimal transactionsValue1;
    private BigDecimal transactionsValue2;
    private BigDecimal transactionsValue3;
    private BigDecimal transactionsValue4;
    private BigDecimal transactionsValue5;
    private BigDecimal transactionsValue6;
    private BigDecimal transactionsValue7;
    private String transactionsV1;
    private String transactionsV2;
    private String transactionsV3;
    private String transactionsV4;
    private String transactionsV5;
    private String transactionsV6;
    private String transactionsV7;
    private String transactionsV8;
    private String transactionsV9;
    private Timestamp transactionsReqTs;
    private Timestamp transactionsResTs;

    @Id
    @Column(name = "transactions_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getTransactionsId() {
        return transactionsId;
    }

    public void setTransactionsId(int transactionsId) {
        this.transactionsId = transactionsId;
    }

    @Basic
    @Column(name = "transactions_ch_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsChCode() {
        return transactionsChCode;
    }

    public void setTransactionsChCode(String transactionsChCode) {
        this.transactionsChCode = transactionsChCode;
    }

    @Basic
    @Column(name = "transactions_ch_mobile", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsChMobile() {
        return transactionsChMobile;
    }

    public void setTransactionsChMobile(String transactionsChMobile) {
        this.transactionsChMobile = transactionsChMobile;
    }

    @Basic
    @Column(name = "transactions_ch_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsChId() {
        return transactionsChId;
    }

    public void setTransactionsChId(Integer transactionsChId) {
        this.transactionsChId = transactionsChId;
    }

    @Basic
    @Column(name = "transactions_ch_type_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsChTypeId() {
        return transactionsChTypeId;
    }

    public void setTransactionsChTypeId(Integer transactionsChTypeId) {
        this.transactionsChTypeId = transactionsChTypeId;
    }

    @Basic
    @Column(name = "transactions_interface_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsInterfaceId() {
        return transactionsInterfaceId;
    }

    public void setTransactionsInterfaceId(Integer transactionsInterfaceId) {
        this.transactionsInterfaceId = transactionsInterfaceId;
    }

    @Basic
    @Column(name = "transactions_parent_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsParentId() {
        return transactionsParentId;
    }

    public void setTransactionsParentId(Integer transactionsParentId) {
        this.transactionsParentId = transactionsParentId;
    }

    @Basic
    @Column(name = "transactions_ch_recip_code", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsChRecipCode() {
        return transactionsChRecipCode;
    }

    public void setTransactionsChRecipCode(Integer transactionsChRecipCode) {
        this.transactionsChRecipCode = transactionsChRecipCode;
    }

    @Basic
    @Column(name = "transactions_ch_recip_mobile", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsChRecipMobile() {
        return transactionsChRecipMobile;
    }

    public void setTransactionsChRecipMobile(Integer transactionsChRecipMobile) {
        this.transactionsChRecipMobile = transactionsChRecipMobile;
    }

    @Basic
    @Column(name = "transactions_ch_recip_ch_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsChRecipChId() {
        return transactionsChRecipChId;
    }

    public void setTransactionsChRecipChId(Integer transactionsChRecipChId) {
        this.transactionsChRecipChId = transactionsChRecipChId;
    }

    @Basic
    @Column(name = "transactions_ch_recip_ch_type_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsChRecipChTypeId() {
        return transactionsChRecipChTypeId;
    }

    public void setTransactionsChRecipChTypeId(Integer transactionsChRecipChTypeId) {
        this.transactionsChRecipChTypeId = transactionsChRecipChTypeId;
    }

    @Basic
    @Column(name = "transactions_wallet_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsWalletId() {
        return transactionsWalletId;
    }

    public void setTransactionsWalletId(Integer transactionsWalletId) {
        this.transactionsWalletId = transactionsWalletId;
    }

    @Basic
    @Column(name = "transactions_recip_wallet_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsRecipWalletId() {
        return transactionsRecipWalletId;
    }

    public void setTransactionsRecipWalletId(Integer transactionsRecipWalletId) {
        this.transactionsRecipWalletId = transactionsRecipWalletId;
    }

    @Basic
    @Column(name = "transactions_pre_bal", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsPreBal() {
        return transactionsPreBal;
    }

    public void setTransactionsPreBal(BigDecimal transactionsPreBal) {
        this.transactionsPreBal = transactionsPreBal;
    }

    @Basic
    @Column(name = "transactions_post_bal", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsPostBal() {
        return transactionsPostBal;
    }

    public void setTransactionsPostBal(BigDecimal transactionsPostBal) {
        this.transactionsPostBal = transactionsPostBal;
    }

    @Basic
    @Column(name = "transactions_recip_pre_bal", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsRecipPreBal() {
        return transactionsRecipPreBal;
    }

    public void setTransactionsRecipPreBal(BigDecimal transactionsRecipPreBal) {
        this.transactionsRecipPreBal = transactionsRecipPreBal;
    }

    @Basic
    @Column(name = "transactions_recip_post_bal", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsRecipPostBal() {
        return transactionsRecipPostBal;
    }

    public void setTransactionsRecipPostBal(BigDecimal transactionsRecipPostBal) {
        this.transactionsRecipPostBal = transactionsRecipPostBal;
    }

    @Basic
    @Column(name = "transactions_transaction_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsTransactionId() {
        return transactionsTransactionId;
    }

    public void setTransactionsTransactionId(Integer transactionsTransactionId) {
        this.transactionsTransactionId = transactionsTransactionId;
    }

    @Basic
    @Column(name = "transactions_trans_type_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsTransTypeId() {
        return transactionsTransTypeId;
    }

    public void setTransactionsTransTypeId(Integer transactionsTransTypeId) {
        this.transactionsTransTypeId = transactionsTransTypeId;
    }

    @Basic
    @Column(name = "transactions_trans_type_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsTransTypeCode() {
        return transactionsTransTypeCode;
    }

    public void setTransactionsTransTypeCode(String transactionsTransTypeCode) {
        this.transactionsTransTypeCode = transactionsTransTypeCode;
    }

    @Basic
    @Column(name = "transactions_ref_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getTransactionsRefId() {
        return transactionsRefId;
    }

    public void setTransactionsRefId(Integer transactionsRefId) {
        this.transactionsRefId = transactionsRefId;
    }

    @Basic
    @Column(name = "transactions_agent_trans_id", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsAgentTransId() {
        return transactionsAgentTransId;
    }

    public void setTransactionsAgentTransId(String transactionsAgentTransId) {
        this.transactionsAgentTransId = transactionsAgentTransId;
    }

    @Basic
    @Column(name = "transactions_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue() {
        return transactionsValue;
    }

    public void setTransactionsValue(BigDecimal transactionsValue) {
        this.transactionsValue = transactionsValue;
    }

    @Basic
    @Column(name = "transactions_si_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsSiCode() {
        return transactionsSiCode;
    }

    public void setTransactionsSiCode(String transactionsSiCode) {
        this.transactionsSiCode = transactionsSiCode;
    }

    @Basic
    @Column(name = "transactions_si_result_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsSiResultCode() {
        return transactionsSiResultCode;
    }

    public void setTransactionsSiResultCode(String transactionsSiResultCode) {
        this.transactionsSiResultCode = transactionsSiResultCode;
    }

    @Basic
    @Column(name = "transactions_si_result_desc", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsSiResultDesc() {
        return transactionsSiResultDesc;
    }

    public void setTransactionsSiResultDesc(String transactionsSiResultDesc) {
        this.transactionsSiResultDesc = transactionsSiResultDesc;
    }

    @Basic
    @Column(name = "transactions_result_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsResultCode() {
        return transactionsResultCode;
    }

    public void setTransactionsResultCode(String transactionsResultCode) {
        this.transactionsResultCode = transactionsResultCode;
    }

    @Basic
    @Column(name = "transactions_result_desc", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsResultDesc() {
        return transactionsResultDesc;
    }

    public void setTransactionsResultDesc(String transactionsResultDesc) {
        this.transactionsResultDesc = transactionsResultDesc;
    }

    @Basic
    @Column(name = "transactions_ip", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsIp() {
        return transactionsIp;
    }

    public void setTransactionsIp(String transactionsIp) {
        this.transactionsIp = transactionsIp;
    }

    @Basic
    @Column(name = "transactions_os", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsOs() {
        return transactionsOs;
    }

    public void setTransactionsOs(String transactionsOs) {
        this.transactionsOs = transactionsOs;
    }

    @Basic
    @Column(name = "transactions_value1", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue1() {
        return transactionsValue1;
    }

    public void setTransactionsValue1(BigDecimal transactionsValue1) {
        this.transactionsValue1 = transactionsValue1;
    }

    @Basic
    @Column(name = "transactions_value2", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue2() {
        return transactionsValue2;
    }

    public void setTransactionsValue2(BigDecimal transactionsValue2) {
        this.transactionsValue2 = transactionsValue2;
    }

    @Basic
    @Column(name = "transactions_value3", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue3() {
        return transactionsValue3;
    }

    public void setTransactionsValue3(BigDecimal transactionsValue3) {
        this.transactionsValue3 = transactionsValue3;
    }

    @Basic
    @Column(name = "transactions_value4", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue4() {
        return transactionsValue4;
    }

    public void setTransactionsValue4(BigDecimal transactionsValue4) {
        this.transactionsValue4 = transactionsValue4;
    }

    @Basic
    @Column(name = "transactions_value5", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue5() {
        return transactionsValue5;
    }

    public void setTransactionsValue5(BigDecimal transactionsValue5) {
        this.transactionsValue5 = transactionsValue5;
    }

    @Basic
    @Column(name = "transactions_value6", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue6() {
        return transactionsValue6;
    }

    public void setTransactionsValue6(BigDecimal transactionsValue6) {
        this.transactionsValue6 = transactionsValue6;
    }

    @Basic
    @Column(name = "transactions_value7", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getTransactionsValue7() {
        return transactionsValue7;
    }

    public void setTransactionsValue7(BigDecimal transactionsValue7) {
        this.transactionsValue7 = transactionsValue7;
    }

    @Basic
    @Column(name = "transactions_v1", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV1() {
        return transactionsV1;
    }

    public void setTransactionsV1(String transactionsV1) {
        this.transactionsV1 = transactionsV1;
    }

    @Basic
    @Column(name = "transactions_v2", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV2() {
        return transactionsV2;
    }

    public void setTransactionsV2(String transactionsV2) {
        this.transactionsV2 = transactionsV2;
    }

    @Basic
    @Column(name = "transactions_v3", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV3() {
        return transactionsV3;
    }

    public void setTransactionsV3(String transactionsV3) {
        this.transactionsV3 = transactionsV3;
    }

    @Basic
    @Column(name = "transactions_v4", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV4() {
        return transactionsV4;
    }

    public void setTransactionsV4(String transactionsV4) {
        this.transactionsV4 = transactionsV4;
    }

    @Basic
    @Column(name = "transactions_v5", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV5() {
        return transactionsV5;
    }

    public void setTransactionsV5(String transactionsV5) {
        this.transactionsV5 = transactionsV5;
    }

    @Basic
    @Column(name = "transactions_v6", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV6() {
        return transactionsV6;
    }

    public void setTransactionsV6(String transactionsV6) {
        this.transactionsV6 = transactionsV6;
    }

    @Basic
    @Column(name = "transactions_v7", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV7() {
        return transactionsV7;
    }

    public void setTransactionsV7(String transactionsV7) {
        this.transactionsV7 = transactionsV7;
    }

    @Basic
    @Column(name = "transactions_v8", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV8() {
        return transactionsV8;
    }

    public void setTransactionsV8(String transactionsV8) {
        this.transactionsV8 = transactionsV8;
    }

    @Basic
    @Column(name = "transactions_v9", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionsV9() {
        return transactionsV9;
    }

    public void setTransactionsV9(String transactionsV9) {
        this.transactionsV9 = transactionsV9;
    }

    @Basic
    @Column(name = "transactions_req_ts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getTransactionsReqTs() {
        return transactionsReqTs;
    }

    public void setTransactionsReqTs(Timestamp transactionsReqTs) {
        this.transactionsReqTs = transactionsReqTs;
    }

    @Basic
    @Column(name = "transactions_res_ts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getTransactionsResTs() {
        return transactionsResTs;
    }

    public void setTransactionsResTs(Timestamp transactionsResTs) {
        this.transactionsResTs = transactionsResTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionsEntity that = (TransactionsEntity) o;

        if (transactionsId != that.transactionsId) return false;
        if (transactionsAgentTransId != null ? !transactionsAgentTransId.equals(that.transactionsAgentTransId) : that.transactionsAgentTransId != null)
            return false;
        if (transactionsChCode != null ? !transactionsChCode.equals(that.transactionsChCode) : that.transactionsChCode != null)
            return false;
        if (transactionsChId != null ? !transactionsChId.equals(that.transactionsChId) : that.transactionsChId != null)
            return false;
        if (transactionsChMobile != null ? !transactionsChMobile.equals(that.transactionsChMobile) : that.transactionsChMobile != null)
            return false;
        if (transactionsChRecipChId != null ? !transactionsChRecipChId.equals(that.transactionsChRecipChId) : that.transactionsChRecipChId != null)
            return false;
        if (transactionsChRecipChTypeId != null ? !transactionsChRecipChTypeId.equals(that.transactionsChRecipChTypeId) : that.transactionsChRecipChTypeId != null)
            return false;
        if (transactionsChRecipCode != null ? !transactionsChRecipCode.equals(that.transactionsChRecipCode) : that.transactionsChRecipCode != null)
            return false;
        if (transactionsChRecipMobile != null ? !transactionsChRecipMobile.equals(that.transactionsChRecipMobile) : that.transactionsChRecipMobile != null)
            return false;
        if (transactionsChTypeId != null ? !transactionsChTypeId.equals(that.transactionsChTypeId) : that.transactionsChTypeId != null)
            return false;
        if (transactionsInterfaceId != null ? !transactionsInterfaceId.equals(that.transactionsInterfaceId) : that.transactionsInterfaceId != null)
            return false;
        if (transactionsIp != null ? !transactionsIp.equals(that.transactionsIp) : that.transactionsIp != null)
            return false;
        if (transactionsOs != null ? !transactionsOs.equals(that.transactionsOs) : that.transactionsOs != null)
            return false;
        if (transactionsParentId != null ? !transactionsParentId.equals(that.transactionsParentId) : that.transactionsParentId != null)
            return false;
        if (transactionsPostBal != null ? !transactionsPostBal.equals(that.transactionsPostBal) : that.transactionsPostBal != null)
            return false;
        if (transactionsPreBal != null ? !transactionsPreBal.equals(that.transactionsPreBal) : that.transactionsPreBal != null)
            return false;
        if (transactionsRecipPostBal != null ? !transactionsRecipPostBal.equals(that.transactionsRecipPostBal) : that.transactionsRecipPostBal != null)
            return false;
        if (transactionsRecipPreBal != null ? !transactionsRecipPreBal.equals(that.transactionsRecipPreBal) : that.transactionsRecipPreBal != null)
            return false;
        if (transactionsRecipWalletId != null ? !transactionsRecipWalletId.equals(that.transactionsRecipWalletId) : that.transactionsRecipWalletId != null)
            return false;
        if (transactionsRefId != null ? !transactionsRefId.equals(that.transactionsRefId) : that.transactionsRefId != null)
            return false;
        if (transactionsReqTs != null ? !transactionsReqTs.equals(that.transactionsReqTs) : that.transactionsReqTs != null)
            return false;
        if (transactionsResTs != null ? !transactionsResTs.equals(that.transactionsResTs) : that.transactionsResTs != null)
            return false;
        if (transactionsResultCode != null ? !transactionsResultCode.equals(that.transactionsResultCode) : that.transactionsResultCode != null)
            return false;
        if (transactionsResultDesc != null ? !transactionsResultDesc.equals(that.transactionsResultDesc) : that.transactionsResultDesc != null)
            return false;
        if (transactionsSiCode != null ? !transactionsSiCode.equals(that.transactionsSiCode) : that.transactionsSiCode != null)
            return false;
        if (transactionsSiResultCode != null ? !transactionsSiResultCode.equals(that.transactionsSiResultCode) : that.transactionsSiResultCode != null)
            return false;
        if (transactionsSiResultDesc != null ? !transactionsSiResultDesc.equals(that.transactionsSiResultDesc) : that.transactionsSiResultDesc != null)
            return false;
        if (transactionsTransTypeCode != null ? !transactionsTransTypeCode.equals(that.transactionsTransTypeCode) : that.transactionsTransTypeCode != null)
            return false;
        if (transactionsTransTypeId != null ? !transactionsTransTypeId.equals(that.transactionsTransTypeId) : that.transactionsTransTypeId != null)
            return false;
        if (transactionsTransactionId != null ? !transactionsTransactionId.equals(that.transactionsTransactionId) : that.transactionsTransactionId != null)
            return false;
        if (transactionsV1 != null ? !transactionsV1.equals(that.transactionsV1) : that.transactionsV1 != null)
            return false;
        if (transactionsV2 != null ? !transactionsV2.equals(that.transactionsV2) : that.transactionsV2 != null)
            return false;
        if (transactionsV3 != null ? !transactionsV3.equals(that.transactionsV3) : that.transactionsV3 != null)
            return false;
        if (transactionsV4 != null ? !transactionsV4.equals(that.transactionsV4) : that.transactionsV4 != null)
            return false;
        if (transactionsV5 != null ? !transactionsV5.equals(that.transactionsV5) : that.transactionsV5 != null)
            return false;
        if (transactionsV6 != null ? !transactionsV6.equals(that.transactionsV6) : that.transactionsV6 != null)
            return false;
        if (transactionsV7 != null ? !transactionsV7.equals(that.transactionsV7) : that.transactionsV7 != null)
            return false;
        if (transactionsV8 != null ? !transactionsV8.equals(that.transactionsV8) : that.transactionsV8 != null)
            return false;
        if (transactionsV9 != null ? !transactionsV9.equals(that.transactionsV9) : that.transactionsV9 != null)
            return false;
        if (transactionsValue != null ? !transactionsValue.equals(that.transactionsValue) : that.transactionsValue != null)
            return false;
        if (transactionsValue1 != null ? !transactionsValue1.equals(that.transactionsValue1) : that.transactionsValue1 != null)
            return false;
        if (transactionsValue2 != null ? !transactionsValue2.equals(that.transactionsValue2) : that.transactionsValue2 != null)
            return false;
        if (transactionsValue3 != null ? !transactionsValue3.equals(that.transactionsValue3) : that.transactionsValue3 != null)
            return false;
        if (transactionsValue4 != null ? !transactionsValue4.equals(that.transactionsValue4) : that.transactionsValue4 != null)
            return false;
        if (transactionsValue5 != null ? !transactionsValue5.equals(that.transactionsValue5) : that.transactionsValue5 != null)
            return false;
        if (transactionsValue6 != null ? !transactionsValue6.equals(that.transactionsValue6) : that.transactionsValue6 != null)
            return false;
        if (transactionsValue7 != null ? !transactionsValue7.equals(that.transactionsValue7) : that.transactionsValue7 != null)
            return false;
        if (transactionsWalletId != null ? !transactionsWalletId.equals(that.transactionsWalletId) : that.transactionsWalletId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transactionsId;
        result = 31 * result + (transactionsChCode != null ? transactionsChCode.hashCode() : 0);
        result = 31 * result + (transactionsChMobile != null ? transactionsChMobile.hashCode() : 0);
        result = 31 * result + (transactionsChId != null ? transactionsChId.hashCode() : 0);
        result = 31 * result + (transactionsChTypeId != null ? transactionsChTypeId.hashCode() : 0);
        result = 31 * result + (transactionsInterfaceId != null ? transactionsInterfaceId.hashCode() : 0);
        result = 31 * result + (transactionsParentId != null ? transactionsParentId.hashCode() : 0);
        result = 31 * result + (transactionsChRecipCode != null ? transactionsChRecipCode.hashCode() : 0);
        result = 31 * result + (transactionsChRecipMobile != null ? transactionsChRecipMobile.hashCode() : 0);
        result = 31 * result + (transactionsChRecipChId != null ? transactionsChRecipChId.hashCode() : 0);
        result = 31 * result + (transactionsChRecipChTypeId != null ? transactionsChRecipChTypeId.hashCode() : 0);
        result = 31 * result + (transactionsWalletId != null ? transactionsWalletId.hashCode() : 0);
        result = 31 * result + (transactionsRecipWalletId != null ? transactionsRecipWalletId.hashCode() : 0);
        result = 31 * result + (transactionsPreBal != null ? transactionsPreBal.hashCode() : 0);
        result = 31 * result + (transactionsPostBal != null ? transactionsPostBal.hashCode() : 0);
        result = 31 * result + (transactionsRecipPreBal != null ? transactionsRecipPreBal.hashCode() : 0);
        result = 31 * result + (transactionsRecipPostBal != null ? transactionsRecipPostBal.hashCode() : 0);
        result = 31 * result + (transactionsTransactionId != null ? transactionsTransactionId.hashCode() : 0);
        result = 31 * result + (transactionsTransTypeId != null ? transactionsTransTypeId.hashCode() : 0);
        result = 31 * result + (transactionsTransTypeCode != null ? transactionsTransTypeCode.hashCode() : 0);
        result = 31 * result + (transactionsRefId != null ? transactionsRefId.hashCode() : 0);
        result = 31 * result + (transactionsAgentTransId != null ? transactionsAgentTransId.hashCode() : 0);
        result = 31 * result + (transactionsValue != null ? transactionsValue.hashCode() : 0);
        result = 31 * result + (transactionsSiCode != null ? transactionsSiCode.hashCode() : 0);
        result = 31 * result + (transactionsSiResultCode != null ? transactionsSiResultCode.hashCode() : 0);
        result = 31 * result + (transactionsSiResultDesc != null ? transactionsSiResultDesc.hashCode() : 0);
        result = 31 * result + (transactionsResultCode != null ? transactionsResultCode.hashCode() : 0);
        result = 31 * result + (transactionsResultDesc != null ? transactionsResultDesc.hashCode() : 0);
        result = 31 * result + (transactionsIp != null ? transactionsIp.hashCode() : 0);
        result = 31 * result + (transactionsOs != null ? transactionsOs.hashCode() : 0);
        result = 31 * result + (transactionsValue1 != null ? transactionsValue1.hashCode() : 0);
        result = 31 * result + (transactionsValue2 != null ? transactionsValue2.hashCode() : 0);
        result = 31 * result + (transactionsValue3 != null ? transactionsValue3.hashCode() : 0);
        result = 31 * result + (transactionsValue4 != null ? transactionsValue4.hashCode() : 0);
        result = 31 * result + (transactionsValue5 != null ? transactionsValue5.hashCode() : 0);
        result = 31 * result + (transactionsValue6 != null ? transactionsValue6.hashCode() : 0);
        result = 31 * result + (transactionsValue7 != null ? transactionsValue7.hashCode() : 0);
        result = 31 * result + (transactionsV1 != null ? transactionsV1.hashCode() : 0);
        result = 31 * result + (transactionsV2 != null ? transactionsV2.hashCode() : 0);
        result = 31 * result + (transactionsV3 != null ? transactionsV3.hashCode() : 0);
        result = 31 * result + (transactionsV4 != null ? transactionsV4.hashCode() : 0);
        result = 31 * result + (transactionsV5 != null ? transactionsV5.hashCode() : 0);
        result = 31 * result + (transactionsV6 != null ? transactionsV6.hashCode() : 0);
        result = 31 * result + (transactionsV7 != null ? transactionsV7.hashCode() : 0);
        result = 31 * result + (transactionsV8 != null ? transactionsV8.hashCode() : 0);
        result = 31 * result + (transactionsV9 != null ? transactionsV9.hashCode() : 0);
        result = 31 * result + (transactionsReqTs != null ? transactionsReqTs.hashCode() : 0);
        result = 31 * result + (transactionsResTs != null ? transactionsResTs.hashCode() : 0);
        return result;
    }
}
