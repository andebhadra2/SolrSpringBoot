package com.solr.app.repository;

import java.util.List;

import org.apache.solr.client.solrj.SolrQuery.SortClause;

public class SolrSearchQuery {

	private String searchFor;

	private String q;

	private boolean isHl;

	private List<String> listBQ;

	private List<String> listFQ;

	private List<String> listFields;
	
	private List<String> facetFields;

	private Integer start;

	private Integer rows;

	private boolean indent;

	private boolean facet;
	
	private boolean facetDataSorting;
	
	private List<String> listDefaultFields;

	private List<String> listDefaultFQ;
	
	private List<String> listDefaultHLFields;
	
	private List<SortClause> sortClauses;
	
	

	public boolean isHl() {
		return isHl;
	}

	public void setHl(boolean isHl) {
		this.isHl = isHl;
	}

	public String getSearchFor() {
		return searchFor;
	}

	public void setSearchFor(String searchFor) {
		this.searchFor = searchFor;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public List<String> getListBQ() {
		return listBQ;
	}

	public void setListBQ(List<String> listBQ) {
		this.listBQ = listBQ;
	}

	public List<String> getListFQ() {
		return listFQ;
	}

	public void setListFQ(List<String> listFQ) {
		this.listFQ = listFQ;
	}

	public List<String> getListFields() {
		return listFields;
	}

	public void setListFields(List<String> listFields) {
		this.listFields = listFields;
	}

	public List<String> getFacetFields() {
		return facetFields;
	}

	public void setFacetFields(List<String> facetFields) {
		this.facetFields = facetFields;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public boolean isIndent() {
		return indent;
	}

	public void setIndent(boolean indent) {
		this.indent = indent;
	}

	public boolean isFacet() {
		return facet;
	}

	public void setFacet(boolean facet) {
		this.facet = facet;
	}

	public boolean isFacetDataSorting() {
		return facetDataSorting;
	}

	public void setFacetDataSorting(boolean facetDataSorting) {
		this.facetDataSorting = facetDataSorting;
	}

	public List<String> getListDefaultFields() {
		return listDefaultFields;
	}

	public void setListDefaultFields(List<String> listDefaultFields) {
		this.listDefaultFields = listDefaultFields;
	}

	public List<String> getListDefaultFQ() {
		return listDefaultFQ;
	}

	public void setListDefaultFQ(List<String> listDefaultFQ) {
		this.listDefaultFQ = listDefaultFQ;
	}

	public List<String> getListDefaultHLFields() {
		return listDefaultHLFields;
	}

	public void setListDefaultHLFields(List<String> listDefaultHLFields) {
		this.listDefaultHLFields = listDefaultHLFields;
	}

	public List<SortClause> getSortClauses() {
		return sortClauses;
	}

	public void setSortClauses(List<SortClause> sortClauses) {
		this.sortClauses = sortClauses;
	}
	
	
}