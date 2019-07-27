DECLARE
V_a number(4):=2;
V_b number(4):=4;
V_x number(4);
BEGIN
V_x:=V_a+V_b+(2*V_a*V_b);
dbms_output.put_line('The result is '|| v_x);
END;
/
