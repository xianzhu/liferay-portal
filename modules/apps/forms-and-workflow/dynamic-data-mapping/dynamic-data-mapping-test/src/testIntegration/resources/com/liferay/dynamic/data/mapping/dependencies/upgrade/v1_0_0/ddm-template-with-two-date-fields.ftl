<#assign date1_Data = getterUtil.getLong(date1.getData())>

<#if date1_Data > 0>
	<#assign date1_DateObj = dateUtil.newDate(date1_Data)>

	${dateUtil.getDate(date1_DateObj, "dd MMM yyyy - HH:mm:ss", locale)}
</#if>

<#assign date2_Data = getterUtil.getLong(date2.getData())>

<#if date2_Data > 0>
	<#assign date2_DateObj = dateUtil.newDate(date2_Data)>

	${dateUtil.getDate(date2_DateObj, "dd MMM yyyy - HH:mm:ss", locale)}
</#if>