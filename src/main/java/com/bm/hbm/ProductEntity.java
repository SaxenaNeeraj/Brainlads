package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "product", schema = "", catalog = "brain")
public class ProductEntity {
    private int productId;
    private String productCode;
    private String productName;
    private int productSiId;
    private Integer productCountryId;
    private Byte productIsflexi;
    private BigDecimal productValue;
    private int productStatusId;
    private Timestamp productCts;

    @Id
    @Column(name = "product_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Basic
    @Column(name = "product_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_si_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getProductSiId() {
        return productSiId;
    }

    public void setProductSiId(int productSiId) {
        this.productSiId = productSiId;
    }

    @Basic
    @Column(name = "product_country_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getProductCountryId() {
        return productCountryId;
    }

    public void setProductCountryId(Integer productCountryId) {
        this.productCountryId = productCountryId;
    }

    @Basic
    @Column(name = "product_isflexi", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getProductIsflexi() {
        return productIsflexi;
    }

    public void setProductIsflexi(Byte productIsflexi) {
        this.productIsflexi = productIsflexi;
    }

    @Basic
    @Column(name = "product_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getProductValue() {
        return productValue;
    }

    public void setProductValue(BigDecimal productValue) {
        this.productValue = productValue;
    }

    @Basic
    @Column(name = "product_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getProductStatusId() {
        return productStatusId;
    }

    public void setProductStatusId(int productStatusId) {
        this.productStatusId = productStatusId;
    }

    @Basic
    @Column(name = "product_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getProductCts() {
        return productCts;
    }

    public void setProductCts(Timestamp productCts) {
        this.productCts = productCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (productId != that.productId) return false;
        if (productSiId != that.productSiId) return false;
        if (productStatusId != that.productStatusId) return false;
        if (productCode != null ? !productCode.equals(that.productCode) : that.productCode != null) return false;
        if (productCountryId != null ? !productCountryId.equals(that.productCountryId) : that.productCountryId != null)
            return false;
        if (productCts != null ? !productCts.equals(that.productCts) : that.productCts != null) return false;
        if (productIsflexi != null ? !productIsflexi.equals(that.productIsflexi) : that.productIsflexi != null)
            return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productValue != null ? !productValue.equals(that.productValue) : that.productValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productCode != null ? productCode.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + productSiId;
        result = 31 * result + (productCountryId != null ? productCountryId.hashCode() : 0);
        result = 31 * result + (productIsflexi != null ? productIsflexi.hashCode() : 0);
        result = 31 * result + (productValue != null ? productValue.hashCode() : 0);
        result = 31 * result + productStatusId;
        result = 31 * result + (productCts != null ? productCts.hashCode() : 0);
        return result;
    }
}
