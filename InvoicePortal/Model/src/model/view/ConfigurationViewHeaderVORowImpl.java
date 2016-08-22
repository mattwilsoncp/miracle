package model.view;

import java.sql.Date;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jul 24 10:22:08 CEST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ConfigurationViewHeaderVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AccessibilityType {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getAccessibilityType();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setAccessibilityType((String)value);
            }
        }
        ,
        ChangedBy {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getChangedBy();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setChangedBy((String)value);
            }
        }
        ,
        ChangedDate {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getChangedDate();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setChangedDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreatedDate {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setCreatedDate((Date)value);
            }
        }
        ,
        CvhId {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getCvhId();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setCvhId((Number)value);
            }
        }
        ,
        GroupId {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getGroupId();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setGroupId((String)value);
            }
        }
        ,
        IsDefaultView {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getIsDefaultView();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setIsDefaultView((String)value);
            }
        }
        ,
        Name {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getName();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setName((String)value);
            }
        }
        ,
        ConfigurationViewTabsVO {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getConfigurationViewTabsVO();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ConfigurationViewHeaderVO1 {
            public Object get(ConfigurationViewHeaderVORowImpl obj) {
                return obj.getConfigurationViewHeaderVO1();
            }

            public void put(ConfigurationViewHeaderVORowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ConfigurationViewHeaderVORowImpl object);

        public abstract void put(ConfigurationViewHeaderVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ACCESSIBILITYTYPE = AttributesEnum.AccessibilityType.index();
    public static final int CHANGEDBY = AttributesEnum.ChangedBy.index();
    public static final int CHANGEDDATE = AttributesEnum.ChangedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CVHID = AttributesEnum.CvhId.index();
    public static final int GROUPID = AttributesEnum.GroupId.index();
    public static final int ISDEFAULTVIEW = AttributesEnum.IsDefaultView.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int CONFIGURATIONVIEWTABSVO = AttributesEnum.ConfigurationViewTabsVO.index();
    public static final int CONFIGURATIONVIEWHEADERVO1 = AttributesEnum.ConfigurationViewHeaderVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ConfigurationViewHeaderVORowImpl() {
    }

    /**
     * Gets ConfigurationViewHeaderEO entity object.
     * @return the ConfigurationViewHeaderEO
     */
    public EntityImpl getConfigurationViewHeaderEO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ACCESSIBILITY_TYPE using the alias name AccessibilityType.
     * @return the ACCESSIBILITY_TYPE
     */
    public String getAccessibilityType() {
        return (String) getAttributeInternal(ACCESSIBILITYTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for ACCESSIBILITY_TYPE using the alias name AccessibilityType.
     * @param value value to set the ACCESSIBILITY_TYPE
     */
    public void setAccessibilityType(String value) {
        setAttributeInternal(ACCESSIBILITYTYPE, value);
    }

    /**
     * Gets the attribute value for CHANGED_BY using the alias name ChangedBy.
     * @return the CHANGED_BY
     */
    public String getChangedBy() {
        return (String) getAttributeInternal(CHANGEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CHANGED_BY using the alias name ChangedBy.
     * @param value value to set the CHANGED_BY
     */
    public void setChangedBy(String value) {
        setAttributeInternal(CHANGEDBY, value);
    }

    /**
     * Gets the attribute value for CHANGED_DATE using the alias name ChangedDate.
     * @return the CHANGED_DATE
     */
    public Date getChangedDate() {
        return (Date) getAttributeInternal(CHANGEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CHANGED_DATE using the alias name ChangedDate.
     * @param value value to set the CHANGED_DATE
     */
    public void setChangedDate(Date value) {
        setAttributeInternal(CHANGEDDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for CVH_ID using the alias name CvhId.
     * @return the CVH_ID
     */
    public Number getCvhId() {
        return (Number)getAttributeInternal(CVHID);
    }

    /**
     * Sets <code>value</code> as attribute value for CVH_ID using the alias name CvhId.
     * @param value value to set the CVH_ID
     */
    public void setCvhId(Number value) {
        setAttributeInternal(CVHID, value);
    }

    /**
     * Gets the attribute value for GROUP_ID using the alias name GroupId.
     * @return the GROUP_ID
     */
    public String getGroupId() {
        return (String) getAttributeInternal(GROUPID);
    }

    /**
     * Sets <code>value</code> as attribute value for GROUP_ID using the alias name GroupId.
     * @param value value to set the GROUP_ID
     */
    public void setGroupId(String value) {
        setAttributeInternal(GROUPID, value);
    }

    /**
     * Gets the attribute value for IS_DEFAULT_VIEW using the alias name IsDefaultView.
     * @return the IS_DEFAULT_VIEW
     */
    public String getIsDefaultView() {
        return (String) getAttributeInternal(ISDEFAULTVIEW);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_DEFAULT_VIEW using the alias name IsDefaultView.
     * @param value value to set the IS_DEFAULT_VIEW
     */
    public void setIsDefaultView(String value) {
        setAttributeInternal(ISDEFAULTVIEW, value);
    }

    /**
     * Gets the attribute value for NAME using the alias name Name.
     * @return the NAME
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as attribute value for NAME using the alias name Name.
     * @param value value to set the NAME
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ConfigurationViewTabsVO.
     */
    public RowIterator getConfigurationViewTabsVO() {
        return (RowIterator)getAttributeInternal(CONFIGURATIONVIEWTABSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ConfigurationViewHeaderVO1.
     */
    public RowSet getConfigurationViewHeaderVO1() {
        return (RowSet)getAttributeInternal(CONFIGURATIONVIEWHEADERVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
