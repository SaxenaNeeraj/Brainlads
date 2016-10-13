package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "product_info", schema = "", catalog = "brain")
public class ProductInfoEntity {
    private int productInfoId;
    private int productInfoProductId;
    private BigDecimal productInfoMin;
    private BigDecimal productInfoMax;
    private int productInfoStatusId;
    private Timestamp productInfoCts;

    @Id
    @Column(name = "product_info_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(int productInfoId) {
        this.productInfoId = productInfoId;
    }

    @Basic
    @Column(name = "product_info_product_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getProductInfoProductId() {
        return productInfoProductId;
    }

    public void setProductInfoProductId(int productInfoProductId) {
        this.productInfoProductId = productInfoProductId;
    }

    @Basic
    @Column(name = "product_info_min", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getProductInfoMin() {
        return productInfoMin;
    }

    public void setProductInfoMin(BigDecimal productInfoMin) {
        this.productInfoMin = productInfoMin;
    }

    @Basic
    @Column(name = "product_info_max", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getProductInfoMax() {
        return productInfoMax;
    }

    public void setProductInfoMax(BigDecimal productInfoMax) {
        this.productInfoMax = productInfoMax;
    }

    @Basic
    @Column(name = "product_info_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getProductInfoStatusId() {
        return productInfoStatusId;
    }

    public void setProductInfoStatusId(int productInfoStatusId) {
        this.productInfoStatusId = productInfoStatusId;
    }

    @Basic
    @Column(name = "product_info_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getProductInfoCts() {
        return productInfoCts;
    }

    public void setProductInfoCts(Timestamp productInfoCts) {
        this.productInfoCts = productInfoCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductInfoEntity that = (ProductInfoEntity) o;

        if (productInfoId != that.productInfoId) return false;
        if (productInfoProductId != that.productInfoProductId) return false;
        if (productInfoStatusId != that.productInfoStatusId) return false;
        if (productInfoCts != null ? !productInfoCts.equals(that.productInfoCts) : that.productInfoCts != null)
            return false;
        if (productInfoMax != null ? !productInfoMax.equals(that.productInfoMax) : that.productInfoMax != null)
            return false;
        if (productInfoMin != null ? !productInfoMin.equals(that.productInfoMin) : that.productInfoMin != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productInfoId;
        result = 31 * result + productInfoProductId;
        result = 31 * result + (productInfoMin != null ? productInfoMin.hashCode() : 0);
        result = 31 * result + (productInfoMax != null ? productInfoMax.hashCode() : 0);
        result = 31 * result + productInfoStatusId;
        result = 31 * result + (productInfoCts != null ? productInfoCts.hashCode() : 0);
        return result;
    }
}
