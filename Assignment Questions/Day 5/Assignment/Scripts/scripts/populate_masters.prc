create or replace procedure populate_masters(flag in varchar2) is
begin
  insert into vendors(vendor_id,name,logo,csm_phone,csm_email,multilist_enabled,created_by,created_on,wireless_emails_allowed)
values(1,'XYZ Computer Corporation','\\data\logos\xyz,jpg','510-281-098-190','xyz@verify.com','Y','anand',sysdate,'Y');
insert into vendors(vendor_id,name,logo,csm_phone,csm_email,multilist_enabled,created_by,created_on,wireless_emails_allowed)
values(2,'Pell Mell Automobiles','\\data\logos\pm,jpg','510-213-098-123','pellmell@csupport.com','Y','anand',sysdate,'Y');


insert  into vendor_lists(vendor_id, vendor_list_id, name, description, unsubscribe_url, host_unsubscribe, created_by, created_on)
values (1,1,'Systems',' SYSTEMS','http:\\xyzHS.unsubscribe.com','http:\\xyzHS.unsubscribe.com','anand',sysdate);
insert  into vendor_lists(vendor_id, vendor_list_id, name, description, unsubscribe_url, host_unsubscribe, created_by, created_on)
values (1,2,'Accessories','ACCESORIES','http:\\xyz.unsubscribe.com','http:\\xyz.unsubscribe.com','anand',sysdate);

insert  into vendor_lists(vendor_id, vendor_list_id, name, description, unsubscribe_url, host_unsubscribe, created_by, created_on)
values (2,3,'Cars','Cars','http:\\pm_fc.unsubscribe.com','http:\\pm_fc.unsubscribe.com','anand',sysdate);
insert  into vendor_lists(vendor_id, vendor_list_id, name, description, unsubscribe_url, host_unsubscribe, created_by, created_on)
values (2,4,'Trailers','Sedans','http:\\pm_sd.unsubscribe.com','http:\\pm_sd.unsubscribe.com','anand',sysdate);
insert  into vendor_lists(vendor_id, vendor_list_id, name, description, unsubscribe_url, host_unsubscribe, created_by, created_on)
values (2,5,'Luxury','Luxury','http:\\pm_lx.unsubscribe.com','http:\\pm_lx.unsubscribe.com','anand',sysdate);

insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(1,'Home Systems','Daily',1,1,1,'Irina');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(2,'Business  Systems','Daily',1,2,1,'Vijay.Valla');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(3,'Black Berrys','Daily',1,2,1,'Scott Wayland');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(4,'Printers','Daily',1,2,1,'Sourabh');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(5,'Routers','Daily',1,2,1,'Felice Cheung');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(6,'Family Cars','Daily',2,3,1,'Felice Cheung');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(7,'Sedans','Daily',2,1,1,'Felice Cheung');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(8,'8-Wheelers','Daily',2,3,1,'Evan Bricknell');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(9,'Sedans','MONTHLY',2,4,1,'Greg Giles');
insert  into PROGRAMS(program_id,program_name, program_type, vendor_id, vendor_list_id, special_program_ind, program_director)
values(10,'LUXURY','MONTHLY',2,5,1,'Sam Cheung');

insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(1,1,1,'Daily 10-sep -Home Clear','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(2,1,1,'Daily 10-sep -Home Security','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(3,1,2,'Daily 15-sep -cORPORATE iNFORMATION Security','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(4,1,4,'iNK jET -SEP OFFERS','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(5,1,4,'Laser MATRIX - SEP','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(6,2,6,'Matiz - Christmas','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(7,2,6,'Hyundai - Accent','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(8,2,7,'Corolla-P Big Drive sep','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(9,2,8,'Trailers - Track and Feed ','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(10,2,8,'SSS half track','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(11,2,9,'Chevrolet - Aveo','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(12,2,9,'Ford -Linea sep','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(13,2,10,'BMW -Super Lux ','DAILY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);
insert into campaigns(campaign_id,VENDOR_ID,program_id,campaign_name,campaign_type, target_launch_date,campaign_status_id, 
recurrence_id, template_campaign_id, star_date, end_date)
values(14,2,10,'Audi -A6 OCT','MONTHLY',SYSDATE,1,1,1,SYSDATE,SYSDATE+100);


insert into mt_member_attributes(attribute_id,attribute,description,defined_on,attribute_type_ind)
values(1024,'runidcorrected','runidcorrected',sysdate,1);
insert  into mt_member_attributes(attribute_id,attribute,description,defined_on,attribute_type_ind)
VALUES(1025,'restname1','restname1',SYSDATE,1);
insert  into mt_member_attributes(attribute_id,attribute,description,defined_on,attribute_type_ind)
VALUES(1026,'city','city',SYSDATE,1);
insert  into mt_member_attributes(attribute_id,attribute,description,defined_on,attribute_type_ind)
VALUES(1027,'STATE','STATE',SYSDATE,1);
insert  into mt_member_attributes(attribute_id,attribute,description,defined_on,attribute_type_ind)
VALUES(1028,'ZIPPOSTALCODE','ZIPPOSTALCODE',SYSDATE,1);
	COMMIT;
END   populate_masters;
/
