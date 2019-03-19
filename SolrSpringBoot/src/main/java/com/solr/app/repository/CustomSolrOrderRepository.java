/**
 * 
 */
package com.solr.app.repository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Repository;

import com.solr.app.pojo.Order;

/**
 * @author Dinesh.Rajput
 *
 */
@Repository
public class CustomSolrOrderRepository {
	
	@Resource
	SolrTemplate solrTemplate ;
	
	/*SolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr/").build();
	
     SolrTemplate solrTemplate = new SolrTemplate(client);*/
	
    public List<Order> dynamicSearch(String searchTerm) {
        Criteria conditions = createConditions(searchTerm);
        SimpleQuery search = new SimpleQuery(conditions);
         
        search.addSort(sortByIdDesc());
 
        Page<Order> results = solrTemplate.queryForPage("Order", search, Order.class);
        return results.getContent();
    }
 
    private Criteria createConditions(String searchTerm) {
        Criteria conditions = null;
 
        for (String term: searchTerm.split(" ")) {
            if (conditions == null) {
                conditions = new Criteria("oid").contains(term)
                        .or(new Criteria("odesc").contains(term));
            }
            else {
                conditions = conditions.or(new Criteria("oid").contains(term))
                        .or(new Criteria("odesc").contains(term));
            }
        }
        return conditions;
    }
 
    private Sort sortByIdDesc() {
        return new Sort(Sort.Direction.DESC, "oid");
    }

	public List<Order> findAllOrders() {

		/*SolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr/").build();
		
	     SolrTemplate solrTemplate = new SolrTemplate(client);*/
		

        //Criteria conditions = createConditions("*a*");
	     Criteria conditions = new Criteria("pname").contains("i").or("cname").contains("v");
        SimpleQuery search = new SimpleQuery(conditions);
        
        //SolrSearchQuery solrSearchQuery = new SolrSearchQuery();
       // solrSearchQuery.setQ("");
        //search.getClass();
         
        //search.addSort(sortByIdDesc());
 
        Page<Order> results = solrTemplate.queryForPage("Order", search, Order.class);
        return results.getContent();
    
		// TODO Auto-generated method stub
		//return null;
	}
    
}
