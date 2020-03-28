 #include <stdio.h>
 #include <stdlib.h>

typedef struct node {
	    struct node *next;
	    	struct node *prev;
			char *data;
} node;

void list_append(node *list, char *data) {
	    node *list_end_ptr = list;
	        while (list_end_ptr->next != NULL) {
			        list_end_ptr = list_end_ptr->next;
				    }
		    node *new_node_ptr = malloc(sizeof(*new_node_ptr));
		        *new_node_ptr = (node){.data=data, .prev=list_end_ptr};
			    list_end_ptr->next = new_node_ptr;
}

int main() {
	    node *list = &((node){.data = "a"});
	        list_append(list, "b");
		    list_append(list, "c");

		        for (; list != NULL; list=list->next) {
				        printf("%s\n", list->data);
					    }
}
