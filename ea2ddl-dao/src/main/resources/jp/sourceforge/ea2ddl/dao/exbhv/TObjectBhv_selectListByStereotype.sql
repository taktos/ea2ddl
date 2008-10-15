-- !SelectTablesInPackagePmb!
-- !!java.lang.Integer packageId!!
-- !!java.lang.String stereotype!!
select dflocal.Name as [Name], dflocal.Object_ID as Object_ID
  , dflocal.Scope as Scope, dflocal.Stereotype as Stereotype
  , dflocal.GenOption as GenOption, dflocal.Style as Style
  , dflocal.Classifier as Classifier, dflocal.ea_guid as ea_guid
  , dflocal.StyleEx as StyleEx, dflocal.Cardinality as Cardinality
  , dflocal.Complexity as Complexity, dflocal.PDATA1 as PDATA1
  , dflocal.PDATA2 as PDATA2, dflocal.PDATA3 as PDATA3
  , dflocal.PDATA4 as PDATA4, dflocal.PDATA5 as PDATA5
  , dflocal.IsRoot as IsRoot, dflocal.IsLeaf as IsLeaf
  , dflocal.IsSpec as IsSpec, dflocal.StateFlags as StateFlags
  , dflocal.ActionFlags as ActionFlags, dflocal.EventFlags as EventFlags
  , dflocal.Diagram_ID as Diagram_ID, dflocal.Package_ID as Package_ID
  , dflocal.ParentID as ParentID, dflocal.Version as Version
  , dflocal.Author as Author, dflocal.CreatedDate as CreatedDate
  , dflocal.ModifiedDate as ModifiedDate, dflocal.TPos as TPos
  , dflocal.IsActive as IsActive, dflocal.Status as Status
  , dflocal.Object_Type as Object_Type, dflocal.Alias as Alias
  , dflocal.Note as [Note], dflocal.NType as NType, dflocal.Effort as Effort
  , dflocal.Backcolor as Backcolor, dflocal.BorderStyle as BorderStyle
  , dflocal.BorderWidth as BorderWidth, dflocal.Fontcolor as Fontcolor
  , dflocal.Bordercolor as Bordercolor, dflocal.Tagged as Tagged
  , dflocal.Concurrency as Concurrency, dflocal.Visibility as Visibility
  , dflocal.Persistence as Persistence, dflocal.GenType as GenType
  , dflocal.GenFile as GenFile, dflocal.Header1 as Header1
  , dflocal.Header2 as Header2, dflocal.Phase as Phase
  , dflocal.GenLinks as GenLinks, dflocal.RunState as RunState
  , dflocal.Classifier_guid as Classifier_guid
  , dflocal.PackageFlags as PackageFlags, dflocal.Multiplicity as Multiplicity 
  from t_object dflocal 
 where
   dflocal.Package_ID = /*pmb.packageId*/21
   and dflocal.Stereotype = /*pmb.stereotype*/'table'
 order by dflocal.Name