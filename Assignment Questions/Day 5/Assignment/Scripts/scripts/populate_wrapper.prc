create or replace procedure populate_wrapper(flag varchar2) is
begin
 populate_masters('F');
 
POPULATE_VENDOR_LIST_MEMBERS('F');
end populate_wrapper;
/
