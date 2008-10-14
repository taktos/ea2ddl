SELECT
    CON.Connector_ID, CON.Start_Object_ID, START_OBJ.Name, OPE_SRC.Name
  , CON.End_Object_ID, END_OBJ.Name, OPE_DST.Name, PARAM_SRC.Name
  , PARAM_DST.Name
  -- , PARAM_DST.Object_ID
FROM
    (T_OPERATIONPARAMS AS PARAM_SRC
INNER JOIN ((((T_CONNECTOR AS CON
INNER JOIN T_OBJECT AS START_OBJ          ON CON.Start_Object_ID = START_OBJ.Object_ID)
INNER JOIN T_OBJECT AS END_OBJ            ON CON.End_Object_ID = END_OBJ.Object_ID)
INNER JOIN T_OPERATION AS OPE_SRC         ON CON.SourceRole = OPE_SRC.Name)
INNER JOIN T_OPERATION AS OPE_DST         ON CON.DestRole = OPE_DST.Name) ON PARAM_SRC.OperationID = OPE_SRC.OperationID)
INNER JOIN T_OPERATIONPARAMS AS PARAM_DST ON OPE_DST.OperationID = PARAM_DST.OperationID
where
    CON.Start_Object_ID = /*objectId*/31
-- ForeignKey