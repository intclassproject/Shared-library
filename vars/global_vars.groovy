import groovy.transform.Field
@Field
def  int_api_folder = int_api_rep.split(path_seperator)[4].split('\\' + dot)[0]
@Field
def  db_api_folder = int_db_rep.split(path_seperator)[4].split('\\' + dot)[0]

