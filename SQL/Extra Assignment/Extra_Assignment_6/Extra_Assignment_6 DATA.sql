-- Question a) Insert Data:

USE Extra_6;

-- Insert data into table "employee"

INSERT INTO employee (EmployeeFirstName, EmployeeLastName, EmployeeHireDate, EmployeeStatus, SupervisorID, socialsecuritynumber) 
VALUES				
                ('Tatiana', 'Madgin', '2018-09-24', null, null, '022875063192'),
                ('Christalle', 'Huzzey', '2018-05-29', null, null, '063314335808'),
				('Tremayne', 'Joreau', '2018-07-20', null, null, '064750715833'),
				('Sapphira', 'Kermannes', '2019-01-14', null, 1, '085555181191'),
				('Morissa', 'Roubert', '2019-01-29', null, 2, '092441483071'),
				('Bradney', 'Brilleman', '2019-02-28', null, 1, '086379139076'),
				('Van', 'Aspin', '2019-02-20', null, 3, '032818582928'),
				('Billy', 'Jewes', '2019-01-17', null, 3, '053238566756'),
				('Cathi', 'Goaley', '2019-01-28', null, 2, '014196590934'),
				('Hermione', 'Toupe', '2019-12-13', null, 1, '079902616695'),
				('Aldric', 'Kleinholz', '2019-05-30', null, 6, '066635738260'),
				('Marcille', 'Ibberson', '2019-07-05', null, 6, '073803295298'),
				('Meta', 'Gooder', '2019-10-22', null, 1, '083323949843'),
				('Daloris', 'Pauleau', '2019-06-18', null, 4, '084534962817'),
				('Elle', 'Ackenhead', '2019-11-26', null, 8, '036006079032'),
				('Thibaud', 'Jozef', '2019-09-11', null, 4, '055343551286'),
				('Rollo', 'Louw', '2020-02-12', null, 6, '018627362391'),
				('Ruthanne', 'Tourville', '2019-08-17', null, 1, '005303694969'),
				('Bram', 'Goldspink', '2019-09-05', null, 10, '055338529612'),
				('Myrilla', 'Pardoe', '2019-12-15', null, 8, '039586830130'),
				('Bobbe', 'Slatten', '2019-08-26', null, 10, '036481537930'),
				('Leighton', 'Hedden', '2019-12-15', null, 7, '061498369153'),
				('Kinnie', 'Zoppo', '2020-01-13', null, 3, '055203334164'),
				('Tiena', 'Tander', '2020-01-18', null, 7, '057697977278'),
				('Petronia', 'Torre', '2020-02-26', null, 9, '091937612110'),
				('Marja', 'Attfield', '2020-01-12', null, 8, '077491859367'),
				('Aland', 'Norrey', '2019-05-02', null, 3, '001136936911'),
				('Ilise', 'Lockney', '2019-08-05', null, 5, '051110565664'),
				('Cletis', 'Steely', '2020-05-23', null, 1, '072185636948'),
				('Carney', 'Shaxby', '2020-05-09', null, 7, '030189757818');


-- Insert data into table "project"

INSERT INTO project  (ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) 
VALUES
				(4, 'Clopidogrel Bisulfate', '2020-02-13', 'First Trust Europe AlphaDEX Fund', 'Extirpate matter from L Low Arm Subcu/Fascia, Perc', '2020-06-17'),
				(6, 'ELM MIX', '2020-03-17', 'Lumos Networks Corp.', 'Insert of Infusion Dev into R Shoulder, Perc Endo Approach', '2021-04-08'),
				(6, 'Robinia Nicotiana', '2020-01-31', 'NeuroDerm Ltd.', 'Removal of Infusion Dev from L Tarsal Jt, Perc Endo Approach', '2021-05-08'),
				(7, 'Walgreens', '2020-02-05', 'Stanley Black & Decker, Inc.', 'Excision of Left Foot Tendon, Perc Endo Approach', '2021-02-17'),
				(5, 'NEXIUM', '2020-02-14', 'Consolidated Edison Inc', 'Bypass Cecum to Transverse Colon, Perc Endo Approach', '2021-04-11'),
				(10, 'Symax FasTab', '2020-03-19', 'BT Group plc', 'Supplement L Carpal Jt with Synth Sub, Perc Endo Approach', '2021-01-28'),
				(4, 'Proactiv Sheer Tint Moisture', '2020-03-04', 'Travelzoo', 'Skin and Breast, Alteration', '2021-04-21'),
				(5, 'Hourglass Illusion Tinted Moisturizer Warm Beige', '2020-02-08', 'Gabelli NextShares Trust', 'Revision of Autol Sub in Testis, Perc Endo Approach', '2021-04-08'),
				(10, 'Mertodol Solution', '2020-02-29', 'Colonial Intermediate High Income Fund', 'Dilate of Intracran Art with 4+ Intralum Dev, Perc Approach', '2021-04-13'),
				(1, 'Pink Eye Relief', '2020-03-13', 'Civista Bancshares, Inc. ', 'Excision of Right Eustachian Tube, Percutaneous Approach', '2021-03-30'),
				(3, 'ESIKA HD COLOR HIGH DEFINITION COLOR SPF 20', '2020-03-09', 'AECOM', 'Bypass Bilateral Vas Deferens to R Epidid, Open Approach', '2021-05-21'),
				(8, 'POLYETHYLENE GLYCOL 3350', '2020-02-06', 'iShares MSCI ACWI ex US Index Fund', 'Replace Buttock Skin w Nonaut Sub, Full Thick, Extern', '2021-03-19'),
				(6, 'ADCIRCA', '2020-03-10', 'Blackrock MuniHoldings New Jersey Insured Fund, Inc.', 'Removal of Intralum Dev from Great Vessel, Open Approach', '2021-02-24'),
				(10, 'PERIOSCIENCES SENSITIVE AO Pro', '2020-03-12', 'Toro Company (The)', 'Plain Radiography of R Low Extrem Vein using L Osm Contrast', '2021-04-05'),
				(4, 'LBEL COULEUR LUXE AMPLIFIER XP', '2020-03-02', 'Commercial Metals Company', 'Fluoroscopy of Right Jugular Veins using L Osm Contrast', '2021-04-24');
                

-- Insert data into 

INSERT INTO project_modules (ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompletedOn, ProjectModulesDescription) 
VALUES 

				(8, 27, '2020-07-08', '2020-10-07', 'Extracorporeal Therapies, Phys Sys, Atmospheric Control'),
				(9, 25, '2020-05-20', '2020-10-13', 'Removal of Hearing Device from Skull, Percutaneous Approach'),
				(4, 23, '2020-06-07', '2020-10-19', 'Replace of L Ankle Tendon with Synth Sub, Perc Endo Approach'),
				(6, 22, '2020-05-31', '2020-09-12', 'Destruction of R Com Carotid, Perc Endo Approach'),
				(5, 12, '2020-07-06', '2020-09-03', 'Release Anal Sphincter, Percutaneous Approach'),
				(12, 21, '2020-06-07', '2020-09-12', 'Excision of Right Iris, Percutaneous Approach, Diagnostic'),
				(15, 14, '2020-07-14', '2020-11-27', 'Revision of Nonaut Sub in L Toe Phalanx, Extern Approach'),
				(11, 16, '2020-05-23', '2020-09-15', 'Insertion of Int Fix into R Sacroiliac Jt, Open Approach'),
				(13, 13, '2020-06-04', '2020-09-01', 'Excision of Liver, Open Approach'),
				(13, 28, '2020-05-26', '2020-10-15', 'Occlusion of Left Main Bronchus, Endo'),
				(7, 17, '2020-06-12', '2020-11-16', 'Excision of Anus, Open Approach'),
				(7, 18, '2020-07-11', '2020-12-20', 'Release Middle Esophagus, Open Approach'),
				(13, 21, '2020-05-25', '2020-11-08', 'Introduction of Radioact Subst into Nose, Extern Approach'),
				(5, 28, '2020-06-22', '2020-09-22', 'Revision of Autol Sub in L Humeral Shaft, Open Approach'),
				(9, 26, '2020-06-01', '2020-09-29', 'Excision of Ventricular Septum, Perc Endo Approach'),
				(12, 25, '2020-07-12', '2020-11-10', 'Bypass Pulm Trunk from Carotid w Autol Vn, Perc Endo'),
				(15, 28, '2020-06-12', '2020-12-06', 'Drainage of Parathyroid Gland with Drain Dev, Open Approach'),
				(4, 15, '2020-06-01', '2021-01-16', 'Supplement L Ext Jugular Vein with Nonaut Sub, Perc Approach'),
				(8, 25, '2020-06-06', '2020-10-06', 'Revision of Ext Fix in L Fibula, Perc Approach'),
				(2, 19, '2020-06-10', '2020-11-09', 'HDR Brachytherapy of Stomach using Iodine 125'),
				(6, 18, '2020-06-22', '2020-03-30', 'Beam Radiation of Salivary Glands using Heavy Particles'),
				(7, 14, '2020-07-05', '2020-07-09', 'Replacement of Right Inner Ear with Autol Sub, Open Approach'),
				(10, 11, '2020-05-17', '2020-01-20', 'Tomo Nucl Med Imag Cerebrospinal Fluid w Oth Radionuclide'),
				(12, 16, '2020-05-22', '2020-04-30', 'Map Medulla Oblongata, Open Approach'),
				(4, 17, '2020-07-06', '2020-05-27', 'CT Scan of Brain using Oth Contrast'),
				(5, 16, '2020-06-13', '2020-09-08', 'Occlusion of Middle Colic Artery, Open Approach'),
				(15, 10, '2020-06-25', '2020-03-20', 'CT Scan of R Forearm using H Osm Contrast'),
				(7, 25, '2020-06-06', '2020-02-13', 'Introduction of Oth Anti-infect into Resp Tract, Via Opening'),
				(6, 22, '2020-07-09', '2021-01-17', 'Bypass 1 Cor Art from Thor Art w Nonaut Sub, Perc Endo'),
				(8, 16, '2020-07-07', '2020-07-08', 'Bypass L Fallopian Tube to R Fallop w Nonaut Sub, Perc Endo');
                

-- Insert data into "work_done"

INSERT INTO work_done (EmployeeID, ModuleID, WorkDoneDate, WorkDoneDescription, WorkDoneStatus) 

VALUES 

				(27, 1, '2021-01-08', 'Removal of Intraluminal Device from Left Ear, Via Opening', true),	
				(25, 2, '2021-01-07', 'LDR Brachytherapy of Bronchus using Californium 252', true),
				(23, 3, null, 'Insertion of Infusion Dev into Fem Perineum, Open Approach', false),
				(22, 4, null, 'Release Right Ethmoid Bone, Open Approach', false),
				(21, 5, '2021-01-05', 'Measurement of Urinary Pressure, Via Opening', true),
				(14, 6, '2021-01-01', 'Supplement Papillary Muscle with Synth Sub, Open Approach', true),
				(13, 7, '2021-01-05', 'Drainage of Sacral Plexus, Open Approach', true),
				(16, 8, '2021-01-02', 'Revision of Synth Sub in L Knee Jt, Patella, Extern Approach', true),
				(23, 9, null, 'Drainage of Brachial Plexus with Drain Dev, Open Approach', false),
				(18, 10, '2021-01-02', 'Transfer Oculomotor Nerve to Vagus Nerve, Perc Endo Approach', true),
				(17, 11, '2021-01-02', 'Fusion Cerv Jt w Nonaut Sub, Ant Appr A Col, Open', true),
				(18, 12, null, 'Auditory Evoked Potentials Assess w Electrophysiologic Equip', false),
				(21, 13, '2021-01-02', 'Fusion of Thor Jt, Post Appr A Col, Open Approach', true),
				(28, 14, '2021-01-09', 'Dilation of R Int Iliac Art with 4 Drug-elut, Open Approach', true),
				(26, 15, '2021-01-09', 'Replacement of R Popl Art with Synth Sub, Open Approach', true),
				(25, 16, '2021-01-03', 'Release Left Ethmoid Sinus, Percutaneous Endoscopic Approach', true),
				(28, 17, '2021-01-05', 'Repair Left Trunk Bursa and Ligament, Perc Endo Approach', false),
				(15, 18, '2021-01-02', 'Extirpation of Matter from Bi Adrenal Gland, Open Approach', true),
				(25, 19, null, 'Replace L Low Leg Skin w Nonaut Sub, Full Thick, Extern', false),
				(19, 20, '2021-01-08', 'Excision of Right Axillary Vein, Perc Endo Approach, Diagn', true),
				(18, 21, '2021-01-08', 'Supplement Right Basilic Vein with Autol Sub, Perc Approach', true),
				(14, 22, '2021-01-03', 'Contact Radiation of Hemibody', true),
				(11, 23, '2021-01-09', 'Excision of Left Humeral Shaft, Open Approach', true),
				(16, 24, null, 'Destruction of Transverse Colon, Percutaneous Approach', false),
				(17, 25, '2021-01-01', 'Replacement of L Carpal Jt with Synth Sub, Open Approach', true),
				(16, 26, '2021-01-03', 'Dilation of Pancreatic Duct, Percutaneous Approach', true),
				(10, 27, null, 'Dilate R Post Tib Art, Bifurc, w Drug-elut Intra, Perc Endo', false),
				(25, 28, '2021-01-08', 'Drainage of Median Nerve, Percutaneous Approach, Diagnostic', true),
				(22, 29, '2020-12-31', 'Destruction of Left Maxillary Sinus, Perc Endo Approach', true),
				(16, 30, '2020-12-31', 'Occlusion of Left Kidney Pelvis, Perc Endo Approach', true);			
				

