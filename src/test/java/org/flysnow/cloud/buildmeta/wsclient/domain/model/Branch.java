package org.flysnow.cloud.buildmeta.wsclient.domain.model;

public class Branch {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column branch.id
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column branch.repo_url
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	private String repoUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column branch.name
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column branch.created
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	private Long created;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column branch.id
	 * @return  the value of branch.id
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column branch.id
	 * @param id  the value for branch.id
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column branch.repo_url
	 * @return  the value of branch.repo_url
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public String getRepoUrl() {
		return repoUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column branch.repo_url
	 * @param repoUrl  the value for branch.repo_url
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public void setRepoUrl(String repoUrl) {
		this.repoUrl = repoUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column branch.name
	 * @return  the value of branch.name
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column branch.name
	 * @param name  the value for branch.name
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column branch.created
	 * @return  the value of branch.created
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public Long getCreated() {
		return created;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column branch.created
	 * @param created  the value for branch.created
	 * @mbggenerated  Sun Apr 20 21:14:05 CST 2014
	 */
	public void setCreated(Long created) {
		this.created = created;
	}
}